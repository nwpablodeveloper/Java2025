import { Component } from '@angular/core';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.component.html',
})
export class ProductoListaComponent {

  constructor(
    any:ProductoService
  ){}
}
