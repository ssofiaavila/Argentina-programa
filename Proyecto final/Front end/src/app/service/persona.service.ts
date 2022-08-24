import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, observable } from 'rxjs';
import { persona } from '../model/persona.model';



@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  url= 'http://backendavila.herokuapp.com/personas/';


  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.url+'traer/perfil');
  }
}
