package exercicioseisB;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String gender;
	private String name;
	
	public Person(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void splitGender() {
		 List<String> maleList = new ArrayList();
		 List<String> femaleList = new ArrayList();
		if (gender == "M") {
			maleList.add(name);
		} else {
			femaleList.add(name);
		}
		
		System.out.print("Lista Masculina: " + maleList);
		System.out.print("Lista Feminina: " + femaleList);
	}
	

}
