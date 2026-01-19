package exerciciocinco;

import java.util.HashSet;
import java.util.Scanner;

public class AplicacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefinirPessoas();
	}
	
	public static void DefinirPessoas() {
		//Aqui foi usado o Hashset porque a ordem de inserção não importa nessas listas
		//HashSet<Pessoa> masculino = new Hashset<Pessoa>();
		//HashSet<Pessoa> feminino = new Hashset<Pessoa>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja verificar");
		int contador = scan.nextInt();
		
		Pessoa[] P = new Pessoa[contador + 1];
		
		for (int i = 0; i <= contador; i++) {
			
			
			P[i] = new Pessoa();
			
			System.out.println("Digite o nome da Pessoa");
			String nome = scan.next();
			System.out.println("Digite o sexo da Pessoa");
			char sexo = scan.next().charAt(0);
			P[i].setNome(nome);
			P[i].setSexo(sexo);
			
			
			
		}
		
	}

}
