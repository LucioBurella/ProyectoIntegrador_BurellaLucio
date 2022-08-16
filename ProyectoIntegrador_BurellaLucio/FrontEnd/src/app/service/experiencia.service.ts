import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Experiencia } from '../model/experiencia.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  URL = 'http://localhost:8080/';

  constructor(private http:HttpClient) { }
  public getExperiencia():Observable<Experiencia[]> {
    return this.http.get<Experiencia[]>(this.URL+ 'experiencia/traer');
      
    }
    createSkill(experiencia:Experiencia){
      return this.http.post<Experiencia>(this.URL+'experiencia/crear',experiencia);
    }
    getPersonaId(id:number){
      return this.http.get<Experiencia>(this.URL+"experiencia/"+id);
    }
    updatePersona(experiencia:Experiencia){
      return this.http.put<Experiencia>(this.URL+"experiencia/editar/"+experiencia.id,experiencia);
    }
    deletePersona(experiencia:Experiencia){
      return this.http.delete<Experiencia>(this.URL+"experiencia/borrar/"+experiencia.id);
    
    }



  }