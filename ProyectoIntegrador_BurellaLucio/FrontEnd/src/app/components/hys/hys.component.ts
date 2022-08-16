import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skill } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';



@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css']
})
export class HysComponent implements OnInit {
  skill: Skill = new Skill(0, '',0);
  skilles: Skill [] = []
  constructor(
    private skillsService: SkillsService,
    private route: Router,
  ) 
  { }

  
  ngOnInit(): void {
    this.skillsService.getSkill().subscribe(data =>
      this.skilles = data
    )
  }
  Editar(skill: Skill): void {
    localStorage.setItem("id", skill.id.toString());
    this.route.navigate(["editS"]);
  }
  Delete(skill: Skill) {
    this.skillsService.deleteSkill(skill)
      .subscribe(data => {
        this.skilles = this.skilles.filter(p => p !== skill);
        alert("Skill eliminada...");
      })
    }
    Guardar() {
      this.skillsService.createSkill(this.skill).subscribe(data => {});
     
    }
    obtener(e: any) {
      this.skill.img = e[0].base64;
    }

}
