import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skill } from '../model/skills.model';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {
 URL = 'http://localhost:8080/';

  constructor(private http:HttpClient) { }
  public getSkill():Observable<Skill[]> {
    return this.http.get<Skill[]>(this.URL+ 'skills/traer');
      
    }

    createSkill(skill:Skill){
      return this.http.post<Skill>(this.URL+'skills/crear',skill);
    }
    getSkillId(id:number){
      return this.http.get<Skill>(this.URL+"skills/"+id);
    }
    updateSkill(skill:Skill){
      return this.http.put<Skill>(this.URL+"skills/editar/"+skill.id,skill);
    }
    deleteSkill(skill:Skill){
      return this.http.delete<Skill>(this.URL+"skills/borrar/"+skill.id);
    
    }

  }
