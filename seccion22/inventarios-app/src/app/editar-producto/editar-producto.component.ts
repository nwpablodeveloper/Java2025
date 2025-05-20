import { Component, inject } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';
import { ActivatedRoute } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-editar-producto',
  imports: [FormsModule],
  templateUrl: './editar-producto.component.html',
})
export class EditarProductoComponent {

  producto:Producto = new Producto();
  id: number;

  private productoServicio = inject(ProductoService);
  private ruta = inject(ActivatedRoute);

  ngOnInit(){
    this.id = this.ruta.snapshot.params['id']; // Recuperamos el prametro que viene por url

    this.productoServicio.obtenerProductoPorId(this.id).subscribe({
      next: (datos) => this.producto = datos,
      error: (errores: any) => console.log(errores)
    });
    console.log(this.producto)
  }

  public onSubmit(){

  }

}
