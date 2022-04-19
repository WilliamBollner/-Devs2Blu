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

  url = `${environment.urlApi}/aluno`;

  getListAlunos(){
    return this.http.get<Aluno[]>(this.url);
  }
  getAlunosById(id : number){
    return this.http.get<Aluno>(`${this.url}/${id}`);
  }

  addAluno(aluno: Aluno){
    let url:string = `${environment.urlApi}/aluno`;
    return this.http.post<Aluno>(url, aluno);
  }
}
