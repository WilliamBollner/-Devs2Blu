package entidades;

import java.sql.Date;

public class Aluno {

	private int idAluno;
	private String nomeAluno;
	private String nomeMae;
	private String nomePai;
	private Date dataNasc;
	private double mediaAluno;
	private String sitaluno;

	public Aluno(int idAluno, String nomeAluno, String nomeMae, String nomePai, Date dataNasc, double mediaAluno, String sitaluno) {
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataNasc = dataNasc;
		this.mediaAluno = mediaAluno;
		this.sitaluno = sitaluno;
	}

	public Aluno(String nomeAluno, String nomeMae, String nomePai, Date dataNasc, double mediaAluno, String sitaluno) {
		this.nomeAluno = nomeAluno;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataNasc = dataNasc;
		this.mediaAluno = mediaAluno;
		this.sitaluno = sitaluno;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getMediaAluno() {
		return mediaAluno;
	}

	public void setMediaAluno(double mediaAluno) {
		this.mediaAluno = mediaAluno;
	}

	public String getSitaluno() {
		return sitaluno;
	}

	public void setSitaluno(String sitaluno) {
		this.sitaluno = sitaluno;
	}

}