package exerciciotres;

import java.util.Scanner;

class ConversorDeTipos {

	private static int numero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorDeTipos Cdt = new ConversorDeTipos();
		numero = Cdt.perguntarValor();
		
		Integer num = numero;
		System.out.println(num);
	};
	
	public int perguntarValor(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor, digitar o número que deseja converter");
		int codigo = scan.nextInt();
		
		return codigo;
	}

}
