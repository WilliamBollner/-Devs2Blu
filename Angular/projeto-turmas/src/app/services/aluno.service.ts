import { Aluno } from './../models/aluno';
import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { AlunoListComponent } from '../components/aluno/aluno-list/aluno-list.component';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  constructor(private http: HttpClient) { }

  getListAlunos(){
    let url:string = `${environment.urlApi}/aluno`;
    return this.http.get<Aluno[]>(url);
  }
  getAlunosById(id : number){
    let url:string = `${environment.urlApi}/aluno/${id}`;
    return this.http.get<Aluno>(url);
  }
}
