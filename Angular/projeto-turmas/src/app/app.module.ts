import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PessoaListComponent } from './components/pessoa/pessoa-list/pessoa-list.component';
import { PessoaSaveComponent } from './components/pessoa/pessoa-save/pessoa-save.component';
import { AlunoListComponent } from './components/aluno/aluno-list/aluno-list.component';
import { AlunoSaveComponent } from './components/aluno/aluno-save/aluno-save.component';
import { ProfessorListComponent } from './components/professor/professor-list/professor-list.component';
import { ProfessorSaveComponent } from './components/professor/professor-save/professor-save.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PessoaListComponent,
    PessoaSaveComponent,
    AlunoListComponent,
    AlunoSaveComponent,
    ProfessorListComponent,
    ProfessorSaveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
