package exerciciossete;

public abstract class Person {
	private String name;
	
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIdade() {
		return age;
	}
	
	public void setNome(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public void greeatings() {
		System.out.println("Olá meu nome é: " + this.getName());
		
	}
	
}
