import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner leitor = new Scanner(System.in);
		System.out.println("O tamanho do vetor � " + vetor.length);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o ano de lan�amento de um filme");
			vetor[i] = leitor.nextInt();

		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("O filme foi lan�ado em: " + vetor[i]);
			leitor.close();
		}

	}

}
