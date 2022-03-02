package entidades;

import java.sql.Date;

public class Matricula {

	private int idAluno;
	private int idDiscilplina;
	private Date dtMatricula;
	private String statusMatricula;

	public Matricula() {

	}

	public Matricula(int idAluno, int idDiscilplina, Date dtMatricula, String statusMatricula) {
		this.idAluno = idAluno;
		this.idDiscilplina = idDiscilplina;
		this.dtMatricula = dtMatricula;
		this.statusMatricula = statusMatricula;
	}
	
	

	public Matricula(Date dtMatricula) {
		super();
		this.dtMatricula = dtMatricula;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getInDiscilplina() {
		return idDiscilplina;
	}

	public void setInDiscilplina(int inDiscilplina) {
		this.idDiscilplina = inDiscilplina;
	}

	public Date getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

	public String getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(String statusMatricula) {
		this.statusMatricula = statusMatricula;
	}

}
