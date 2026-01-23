package exercicioseis;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>    namesList			= new ArrayList<String>();	
		namesList 							= getNames();
		
		Collections.sort(namesList);
		
		System.out.println("Lista" + namesList);
		
	}
	
	private static List<String> getNames() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os nomes separados por vírgula (,): ");
		String namesWithComma = scan.nextLine();
		
		String[] names = namesWithComma.split(",");
		
		return Arrays.asList(names);
		
		
	};

}
