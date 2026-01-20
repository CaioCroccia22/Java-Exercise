package exerciciocinco;


enum Genero {
	masculino("M"),
	feminino("F");
	
	private String codigo;

	Genero(String codigo) {
		this.codigo = codigo;
		
	}
}


public class Pessoa {
		private String nome;
		private Genero sexo;
		
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setSexo(Genero sexo) {
			this.sexo = sexo;
		}
		
		public String getNome() {
			return nome;
		}
		
		public Genero getSexo() {
			return sexo;
		}
		
		public String toString() {
			return "Nome: " + this.nome + " " + "Sexo: " + this.sexo;
			
		}
		
}
