package entidades;

public class Avaliacao {
	private int codAluno;
	private int codDisciplina;
	private int nrAvaliacao;
	private double vlrNota;
	Aluno aluno = new Aluno();

	public String retornarAlumo() {
		return aluno.getNomeAluno();
	}

	public Avaliacao(int codAluno, int codDisciplina, int nrAvaliacao, double vlrNota) {
		this.codAluno = codAluno;
		this.codDisciplina = codDisciplina;
		this.nrAvaliacao = nrAvaliacao;
		this.vlrNota = vlrNota;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public int getNrAvaliacao() {
		return nrAvaliacao;
	}

	public void setNrAvaliacao(int nrAvaliacao) {
		this.nrAvaliacao = nrAvaliacao;
	}

	public double getVlrNota() {
		return vlrNota;
	}

	public void setVlrNota(double vlrNota) {
		this.vlrNota = vlrNota;
	}

}