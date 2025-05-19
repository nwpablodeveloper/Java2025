import { Routes } from '@angular/router';
import { ProductoListaComponent } from './producto-lista/producto-lista.component';

// http://localhost:puerto/path (path definidos a continuación)
export const routes: Routes = [
  {path: 'productos', component:ProductoListaComponent},
  {path: '', redirectTo: 'productos', pathMatch: 'full'}
];
