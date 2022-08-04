import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Educacion } from '../model/educacion';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  educacion='http://localhost:8080/educacion/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Educacion[]>{
    return this.httpClient.get<Educacion[]>(this.educacion+ 'lista');
  }

  public details(id:number): Observable<Educacion>{
   return this.httpClient.get<Educacion>(this.educacion+ 'detail/${id}');
  }

  public save(educacion: Educacion): Observable<any>{
    return this.httpClient.post<any>(this.educacion+'create',educacion);
  }

  public update(id:number, educacion: Educacion): Observable<any>{
    return this.httpClient.put<any>(this.educacion+'update/${id} ',educacion);
  }

  public delete(id : number): Observable<any>{
      return this.httpClient.delete<any>(this.educacion+'delete/${id}');
  }

}
