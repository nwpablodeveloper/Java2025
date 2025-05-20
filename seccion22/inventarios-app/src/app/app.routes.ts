import { Routes } from '@angular/router';
import { ProductoListaComponent } from './producto-lista/producto-lista.component';
import { AgregarProductoComponent } from './agregar-producto/agregar-producto.component';
import { EditarProductoComponent } from './editar-producto/editar-producto.component';

// http://localhost:puerto/path (path definidos a continuación)
export const routes: Routes = [
  {path: 'productos', component:ProductoListaComponent},
  {path: 'agregar-producto', component:AgregarProductoComponent},
  {path: 'editar-producto/:id', component:EditarProductoComponent},
  {path: '', redirectTo: 'productos', pathMatch: 'full'}
];
