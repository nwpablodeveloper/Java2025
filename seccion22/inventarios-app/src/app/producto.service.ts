import { inject, Injectable } from '@angular/core';
import { environment } from '../environments/environment'
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Producto } from './producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private urlBase = environment.urlBase
  private clienteHTTP = inject(HttpClient); // Inyección de dependencias de clienteHTTP

  public obtenerProductoLista(): Observable<Producto[]>{
    return this.clienteHTTP.get<Producto[]>(this.urlBase);
  }

}
