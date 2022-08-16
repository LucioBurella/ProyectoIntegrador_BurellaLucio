import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Educacion } from '../model/educacion.model';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {

  URL = 'http://localhost:8080/';

  constructor(
    private http: HttpClient,
  ) { }

  public getEducacion(): Observable<Educacion[]>{
    return this.http.get<Educacion[]>(this.URL + 'educacion/traer');
  }
  createSkill(educacion:Educacion){
    return this.http.post<Educacion>(this.URL+'educacion/crear',educacion);
  }
  getPersonaId(id:number){
    return this.http.get<Educacion>(this.URL+"educacion/"+id);
  }
  updatePersona(educacion:Educacion){
    return this.http.put<Educacion>(this.URL+"educacion/editar/"+educacion.id,educacion);
  }
  deletePersona(educacion:Educacion){
    return this.http.delete<Educacion>(this.URL+"educacion/borrar/"+educacion.id);
  
  }


}
