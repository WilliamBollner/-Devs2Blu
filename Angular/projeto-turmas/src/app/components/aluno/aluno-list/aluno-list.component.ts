import { AlunoService } from './../../../services/aluno.service';
import { Aluno } from './../../../models/aluno';
import { Component, OnInit } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-aluno-list',
  templateUrl: './aluno-list.component.html',
  styleUrls: ['./aluno-list.component.scss']
})
export class AlunoListComponent implements OnInit {

  listAlunos$ = new Observable<Aluno[]>();

  constructor(private route: ActivatedRoute, private AlunoService: AlunoService) { }

  ngOnInit(): void {
    this.listAlunos$ = this.AlunoService.getListAlunos();
  }

  delete(id?: number){
    //let ret = this.AlunoService.delete(id)
    console.log(id);
  }



}
