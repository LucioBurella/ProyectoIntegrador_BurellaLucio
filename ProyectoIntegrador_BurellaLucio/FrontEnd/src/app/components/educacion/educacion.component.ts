import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  educacion: Educacion = new Educacion(0, '', '', '');
  educaciones: Educacion [] = []
  constructor(
    private educacionService: EducacionService,
    private route: Router,
  ) { }

  ngOnInit(): void {
    this.educacionService.getEducacion().subscribe(data =>
      this.educaciones = data
    )
  }

}
