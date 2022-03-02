package main;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Matricula;
import entidadesDao.AlunoDao;
import entidadesDao.MatriculaDao;

public class Main {

	public static void main(String[] args) {
		inserirUnidade();
	}

	static void inserirUnidade() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			AlunoDao alunoD = new AlunoDao();
			int escolha = JOptionPane.showConfirmDialog(null, "Quer inserir um aluno?");
			if (escolha == 0) {
				String nome = JOptionPane.showInputDialog("Digite o nome: ");
				String nommae = JOptionPane.showInputDialog("Digite o nome da mãe: ");
				String nompai = JOptionPane.showInputDialog("Digite o nome do pai: ");
				String datanasc = JOptionPane.showInputDialog("Digite a data de nascimento: ");
				Date dataNasc = sdf.parse(datanasc);
				java.sql.Date dataSql = new java.sql.Date(dataNasc.getTime());
				double media = 0.0;
				String sitaluno = null;
				Aluno aluno = new Aluno(nome, nommae, nompai, dataSql, media, sitaluno);
				if (alunoD.inserir(aluno)) {
					System.out.println("Unidade salva com sucesso");
				} else {
					System.out.println("Erro ao salvar");
				}
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

		
	}
	//Arrumar este métodoss
	static void inserirMatricula() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			MatriculaDao MatriculaD = new MatriculaDao();
			int escolha = JOptionPane.showConfirmDialog(null, "Quer inserir uma matricula?");
			if (escolha == 0) {
				
				double media = 0.0;
				String sitaluno = null;
				int idAluno = Integer.valueOf(JOptionPane.showInputDialog("Digite o id do aluno"));
				int idAvaliacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o id da avaliação"));
				String dataMatricula = JOptionPane.showInputDialog("Digite a data de nascimento: ");
				Date dataMat = sdf.parse(dataMatricula);
				java.sql.Date dataSql = new java.sql.Date(dataMat.getTime());
				String statusMatricula = JOptionPane.showInputDialog("Digite o status da matrícula:");
				Matricula matricula = new Matricula(idAluno, idAvaliacao, dataSql, statusMatricula);
				if (MatriculaD.inserir(matricula)) {
					System.out.println("Matricula salva com sucesso");
				} else {
					System.out.println("Erro ao salvar");
				}
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	
}
}

