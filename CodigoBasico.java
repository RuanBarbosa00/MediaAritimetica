package primeiroCodigo;

import java.util.Scanner;

public class CodigoBasico {

	/*sysout + CTRL+ESPACE = Escreva*/
	/* CTRL+SHIFT+O = Arruma as bibliotecas*/
	
	public static void main(String[] args) {
		/*Instrução para a entrada de dados*/
		Scanner sc = new Scanner(System.in);
		
		/*Criação das variaveis do tipo double*/
		double nota1, nota2 = 0, media;
		
		/*Saida no console*/
		
	System.out.println("Informe a primeira nota ");
	/*Obtendo dado do tpo double informado pelo usuario*/
	nota1 = sc.nextDouble();
		
		if (nota1 > 10) {
			System.out.println("A primeira nota esta incorreta");
			System.exit(0);
			
			
		}
		else {
			/*Saida no console*/
			System.out.println("Informe a segunda nota ");
			
			/*Obtendo dado do tpo double informado pelo usuario*/
			nota2 = sc.nextDouble();
			
		}
				
		if (nota2 > 10) {
			System.out.println("A segunda nota esta incorreta");
			System.exit(0);
			
		}
		
		media = (nota1 + nota2) /2;
		
		if (media >=6) {
			System.out.println("O aluno foi aprovado, media: " + media);
		}
		else {
			System.out.println("O aluno foi reprovado, media: " + media);
		}
		sc.close();

	}

}
