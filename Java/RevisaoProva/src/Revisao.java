import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {

		int quantidadeAluno = 0, quantidadeNotas = 0;
		float nota = 0, somaNotas = 0, somaMedias = 0;
		float media, maior = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		quantidadeAluno = sc.nextInt();
		System.out.println("Informe a quantidade de notas: ");
		quantidadeNotas = sc.nextInt();
		
		for (int i = 1; i <= quantidadeAluno; i++) {
			System.out.println("Informe seu nome:");
			String nome = sc.next();
			somaNotas = 0;
			for (int j = 1; j <= quantidadeNotas; j++) {
				System.out.println("Digite a nota " + j);
				nota = sc.nextFloat();
				somaNotas += nota;
			}
			media = somaNotas/quantidadeNotas;
			somaMedias += media;
			System.out.println(nome + " sua média foi: " + media);
			if(media >=7.5) {
				System.out.println("Você está Aprovado");
			}
			else if(media >=6 && media >7.5){
				System.out.println("Você está em recuperação");
			}else {
				System.out.println("Você está reprovado");
			}
			if(i == 1) {
				maior = media;
			}
			if (media > maior) {
				maior = media;
			}
			
		
		}
		
		float mediaNotas = somaMedias / quantidadeAluno;

		System.out.println("A melhor média foi:" + maior);
		System.out.println("A média das notas foi: " + mediaNotas);
		
		sc.close();
		
	}

}
