package entidades;

public abstract class Pessoa {
		private String nome;
		private String sobrenome;
		private String email;
		private boolean sexo;
		
		public Pessoa(String nome, String sobrenome, String email, boolean sexo) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
			this.sexo = sexo;
		}
		
		public Pessoa(Pessoa pessoa) {
			this.nome = pessoa.getNome();
			this.sobrenome = pessoa.getSobrenome();
			this.email = pessoa.getEmail();
			this.sexo = pessoa.getSexo();
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public boolean getSexo() {
			return sexo;
		}

		public void setSexo(boolean sexo) {
			this.sexo = sexo;
		}
		
		public abstract String gerarCodigo();
		
		public abstract String tratarNome();

		@Override
		public String toString() {
			return  "\n E-mail: "+this.email+
					"\n Sexo: "+((sexo == true) ? "Homem"  : "Mulher");
		}
}
