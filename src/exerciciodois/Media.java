package exerciciodois;
import java.util.Scanner;

public class Media {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	};
	
	public int verificarNumero() {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int[] numeros = new int[4];
		int valor = calculaMedia(numeros, soma, scan);
		return valor;
	}

	
	public int calculaMedia(int[] numeros, int soma, Scanner scan) {
		
		for (int x = 0; x < numeros.length; x++) {
			System.out.println("Digite o próximo número");
			int numero = scan.nextInt();
			soma += numero;
		}
		
		return soma/4;
	}

}
