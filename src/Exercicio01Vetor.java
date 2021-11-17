import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
/* Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa.*/
		String atividades[] = new String[5];
		Scanner leitor = new Scanner(System.in);
		int opcao;
		for(int i=0; i<atividades.length;i++) {
			System.out.println("Por favor, digite a " + (i+1) + " ° atividade do dia de hoje");
			atividades[i] = leitor.next();
		}
		
		System.out.println("Você deseja exibir as atividades na ordem em que foram digitadas ou em ordem inversa?: 1 - EM ORDEM ou 2 - ORDEM INVERSA");
		opcao = leitor.nextInt();
		
		if (opcao==1) {		
			for(int i=0; i<atividades.length;i++) {
				System.out.println(atividades[i]);
			}
			
		}else if (opcao == 2) {
			for(int i=atividades.length-1;i>=0;i--){
				System.out.println(atividades[i]);
			}
			    
			
		}else {
			System.out.println("Opção inválida");
			leitor.close();
		}


	}

}
