import { Component, OnInit } from '@angular/core';
import { Experiencia } from 'src/app/model/experiencia';
import { SExperienciaService } from 'src/app/service/experiencia.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-work',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  SExperiencia: ExperienciaComponent[] = [];

  constructor(private SExperiencia: SExperienciaService[], private tokenService: TokenService) { }


  
  ngOnInit(): void {
  }

}
