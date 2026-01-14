package exercicioquatro;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaEscolar me = new MediaEscolar();
		int[] notas = me.pegarNotas();
		int media   = me.calculaMedia(notas);
		me.verificaSePassou(media);
	}
	
	public static int[] pegarNotas() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a primeira nota\n");
		int num1 = scan.nextInt();
		System.out.print("Digite a segunda nota\n");
		int num2 = scan.nextInt();
		System.out.print("Digite a terceira nota\n");
		int num3 = scan.nextInt();
		System.out.print("Digite a quarta nota\n");
		int num4 = scan.nextInt();
		int[] arr = {num1, num2, num3, num4};
		return arr;
	}
	
	public static int calculaMedia(int[] notas) {
		int soma = 0;
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
			
		}
		int media = soma / 4;
		System.out.print("Sua média é" + " " + media + "\n");
		return media;
	}
	
	public static void verificaSePassou(int media) {
		if (media >= 7) {
			System.out.print("Parabénsss, você passou!!");
		} else if(media >= 5) {
			System.out.print("Você está de recuperação");
		} else {
			System.out.println("Você está reprovado");
		}
	}

}
