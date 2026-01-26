package exercicioseisB;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class splitByGender {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] list = getList(scan);
		createPerson(list);
		
	}
	
	public static String[] getList(Scanner scan){
		System.out.println("Digite uma lista separada por virgula, com o nome e o sexo do usuário, "
				+ "separado por traço/n");
		String fullList = scan.nextLine();
		String[] names = fullList.split(",");

		return names;
	}
	
	public static void createPerson(String[] list) {
		Person[] persons = new Person[list.length];
		for(int i = 0; i < list.length; i++) {
			
			
			String[] person = list[i].split("-");
			
			
			String gender 	= person[1];
			
			String name 	= person[0];
			
			persons[i] = new Person(gender, name);
			
		}
		
		splitGender(persons);
	}
	
	public static void splitGender(Person[] persons) {
		 List<String> maleList = new ArrayList();
		 List<String> femaleList = new ArrayList();
		 
		 for(int i = 0; i < persons.length; i++) {
			 if (persons[i].getGender() == "M") {
				 maleList.add(persons[i].getName());
			 } else {
				 femaleList.add(persons[i].getName());
			 }			 
		 }
		
		System.out.print("Lista Masculina: " + maleList + "\n");
		System.out.print("Lista Feminina: " + femaleList);
	}

	/*
	public static boolean validateGender(String[] list) {
		String[] splitList = list.split("-");
		
	}*/

}
