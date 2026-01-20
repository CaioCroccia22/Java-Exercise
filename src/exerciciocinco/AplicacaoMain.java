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
		HashSet<Pessoa> masculino = new HashSet<Pessoa>();
		HashSet<Pessoa> feminino = new HashSet<Pessoa>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja verificar");
		int contador = scan.nextInt();
		
		// delimitar quanto de espaço o array tem
		Pessoa[] P = new Pessoa[contador + 1];
		
		for (int i = 0; i <= contador; i++) {
			
			
			P[i] = new Pessoa();
			
			System.out.println("Digite o nome da Pessoa");
			String nome = scan.next();
			System.out.println("Digite o sexo da Pessoa (masculino ou feminino)");
			String sexo = scan.next();
			Genero genero = Genero.valueOf(sexo);
			
			P[i].setNome(nome);
			P[i].setSexo(genero);
			
			if (genero == Genero.masculino) {
					masculino.add(P[i]);
				
			} 
			else if (genero == Genero.feminino) {
					feminino.add(P[i]);
			}
			
		}
		
		MostrarPessoas(masculino.toString(), feminino.toString());
		
	}
	
	public static void MostrarPessoas(String masculino, String feminino) {
		System.out.println("************ Lista de Homens *********");
		System.out.println(masculino);
		System.out.println("************ Lista de Mulheres *********");
		System.out.println(feminino);
		
	}
}
