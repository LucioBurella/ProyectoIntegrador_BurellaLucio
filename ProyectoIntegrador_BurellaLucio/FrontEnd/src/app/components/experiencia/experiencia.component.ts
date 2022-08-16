import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  experiencia: Experiencia = new Experiencia(0,"","","");
  experiencias:Experiencia []=[];
  constructor(private experienciaService: ExperienciaService, private route: Router) { }

  ngOnInit(): void {
  this.experienciaService.getExperiencia().subscribe(data => {this.experiencias=data})

}

Nuevo(){
  this.route.navigate(['agregar']);
}

Editar(){
  this.route.navigate(['Editar']);
}

Delete(){
  this.route.navigate(['Delete']);
}

}
