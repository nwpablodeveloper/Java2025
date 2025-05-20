import { Component, inject } from '@angular/core';
import { ProductoService } from '../producto.service';
import { Producto } from '../producto';
import { Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.component.html',
})
export class ProductoListaComponent {

  productos!:Producto[];

  // Inyecccion de servicio (ya no se hace en el constructor)
  private productoServicio = inject(ProductoService)
  private enrutador = inject(Router)

  ngOnInit(){
    this.obtenerProductos();
  }

  private obtenerProductos(): void{
    this.productoServicio.obtenerProductoLista().subscribe(
      {
        next: (datos) => {
          this.productos = datos;
          console.log(this.productos)
        },
        error: (error) => {
          console.log("Error al obtener los productos: ", error)
        }
      }
    )
  }

  public editarProducto(idProducto:number){
    this.enrutador.navigate(['editar-producto',idProducto])
  }

  public eliminarProducto(id:number){
    this.productoServicio.eliminarProducto(id).subscribe({
      next: (datos) => this.obtenerProductos(),
      error: (errores) => console.log(errores)
    })
  }

}
