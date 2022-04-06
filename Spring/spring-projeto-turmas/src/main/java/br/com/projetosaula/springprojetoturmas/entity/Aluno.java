package br.com.projetosaula.springprojetoturmas.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa{

	private Turma turma;
	private int ano;
	private List<Disciplina> disciplina;
	
	public Aluno() {}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
