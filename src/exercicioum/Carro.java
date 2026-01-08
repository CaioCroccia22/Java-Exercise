package exercicioum;

public class Carro {
	
	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setModelo("Spider");
		carro.setMarca("Ferrari");
		carro.setAno(2025);
		
		carro.ligarCarro();

	}

	private String modelo;
	private String marca;
	private int ano;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno(int ano) {
		return ano;
	}
	
	public void ligarCarro() {
		System.out.println(getMarca() + " " +"Ligando.... vrummm");
	}

}
