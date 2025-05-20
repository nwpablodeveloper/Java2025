import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Producto } from './producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private urlBase = "http://localhost:2204/inventario-app/productos"
  private clienteHTTP = inject(HttpClient); // Inyección de dependencias de clienteHTTP

  public obtenerProductoLista(): Observable<Producto[]>{
    return this.clienteHTTP.get<Producto[]>(this.urlBase);
  }

  public agregarProducto(producto:Producto): Observable<Producto>{
    return this.clienteHTTP.post<Producto>(this.urlBase, producto);
  }

  public obtenerProductoPorId(id:number){
    console.log("asdf")
    console.log(id)
    return this.clienteHTTP.get<Producto>(`${this.urlBase}/${id}`);
  }

  public editarProducto(id:number, producto:Producto){
    return this.clienteHTTP.put(`${this.urlBase}/${id}`, producto)
  }

}
