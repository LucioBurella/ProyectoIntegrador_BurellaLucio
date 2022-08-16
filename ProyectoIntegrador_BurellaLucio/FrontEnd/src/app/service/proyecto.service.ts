import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proyecto } from '../model/proyecto.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectoService {
  URL = 'http://localhost:8080/';
  constructor(private http:HttpClient) { }
  public getProyecto():Observable<Proyecto[]> {
    return this.http.get<Proyecto[]>(this.URL+ 'proyecto/traer'); 
    }
    createProyecto(proyecto:Proyecto){
      return this.http.post<Proyecto>(this.URL+'proyecto/crear',proyecto);
    }
    getProyectoId(id:number){
      return this.http.get<Proyecto>(this.URL+"proyecto/"+id);
    }
    updateProyecto(proyecto:Proyecto){
      return this.http.put<Proyecto>(this.URL+"personas/editar/"+proyecto.id,proyecto);
    }
    deleteProyecto(proyecto:Proyecto){
      return this.http.delete<Proyecto>(this.URL+"personas/borrar/"+proyecto.id);
    
    }
}
