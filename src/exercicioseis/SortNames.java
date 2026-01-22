package exercicioseis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNames();
		
	}
	
	private static void getNames() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os nomes separados por vírgula (,): ");
		String namesWithComma = scan.next();
		
		String[] names = namesWithComma.split(",");
		
		List <String> namesList = Arrays.asList(names);
		
		System.out.println(namesList);
		
		
	}
	
	

}
