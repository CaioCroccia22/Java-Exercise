package exerciciossete;

public class LegalPerson extends Person{
	private String CNPJ;
	
	public LegalPerson(String name, int age, String CNPJ) {
		super(name, age);
		this.CNPJ = CNPJ;
		
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}
