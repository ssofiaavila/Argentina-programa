import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-new-educacion',
  templateUrl: './new-educacion.component.html',
  styleUrls: ['./new-educacion.component.css']
})
export class NewEducacionComponent implements OnInit {

  nombreE: string;
  descripcionE: string;
  inicioE:number;
  finE:number

  constructor(private educacionS: EducacionService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate():void{
    const educacion= new Educacion(this.nombreE,this.descripcionE, this.inicioE, this.finE);
    this.educacionS.save(educacion).subscribe(data =>{
      alert("Educacion añadida");
      this.router.navigate(['']);
    },err => {
      alert("Falló");
    this.router.navigate(['']);
  }
    )
}

}