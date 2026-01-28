package exerciciossete;

public class Individual extends Person{
		
	private String CPF;
		
	public Individual(String name, int age, String CPF) {
		super(name, age);
		this.CPF = CPF;
		
	}


	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	 @Override
	 public void greeatings() {
		 System.out.println("Olá meu nome é: " + this.getName()
		 + "e meu CPF é: " + this.getCPF());
	 }
	
	
	
}
