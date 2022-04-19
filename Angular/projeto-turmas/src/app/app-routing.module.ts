import { AlunoSaveComponent } from './components/aluno/aluno-save/aluno-save.component';
import { AlunoListComponent } from './components/aluno/aluno-list/aluno-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: 'alunos', component: AlunoListComponent},
  {path: 'alunos-save', component: AlunoSaveComponent},
  {path: '', redirectTo: '/alunos', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
