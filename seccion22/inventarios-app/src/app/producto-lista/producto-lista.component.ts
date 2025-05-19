import { Component, inject } from '@angular/core';
import { ProductoService } from '../producto.service';
import { Producto } from '../producto';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.component.html',
})
export class ProductoListaComponent {

  productos!:Producto[];

  // Inyecccion de servicio (ya no se hace en el constructor)
  private productoServicio = inject(ProductoService)

  ngOnInit(){
    this.obtenerProductos();
  }

  private obtenerProductos(): void{
    this.productoServicio.obtenerProductoLista().subscribe(
      {
        next: (datos) => {
          this.productos = datos;
        },
        error: (error) => {
          console.log("Error al obtener los productos: ", error)
        }
      }
    )
  }
}
