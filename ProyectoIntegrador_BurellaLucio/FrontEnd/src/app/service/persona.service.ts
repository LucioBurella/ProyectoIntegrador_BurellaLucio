import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
 URL = 'http://localhost:8080/';

  constructor(private http:HttpClient) { }
  public getPersona():Observable<Persona[]> {
    return this.http.get<Persona[]>(this.URL+ 'personas/traer');
      
    }
    createPersona(persona:Persona){
      return this.http.post<Persona>(this.URL+'personas/crear',persona);
    }
    getPersonaId(id:number){
      return this.http.get<Persona>(this.URL+"personas/"+id);
    }
    updatePersona(persona:Persona){
      return this.http.put<Persona>(this.URL+"personas/editar/"+persona.id,persona);
    }
    deletePersona(persona:Persona){
      return this.http.delete<Persona>(this.URL+"personas/borrar/"+persona.id);
    
    }

  }
