import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Educacion } from '../model/educacion';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  educacion='https://backendavila.herokuapp.com/educacion/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Educacion[]>{
    return this.httpClient.get<Educacion[]>(this.educacion + 'lista');
  }

  public detail(id: number): Observable<Educacion>{
    return this.httpClient.get<Educacion>(this.educacion + `detail/${id}`);
  } 

  public save(experiencia: Educacion): Observable<any>{
    return this.httpClient.post<any>(this.educacion + 'create', experiencia);
  }

  public update(id: number, experiencia: Educacion): Observable<any>{
    return this.httpClient.put<any>(this.educacion + `update/${id}`, experiencia);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.educacion + `delete/${id}`);
  }

}
