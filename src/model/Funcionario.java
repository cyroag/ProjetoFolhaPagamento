package model;

public abstract class Funcionario {
	protected String nome;
	protected int numeroRegistro;
		
	public Funcionario(String nome, int numeroRegistro) {
/*		if(nome == null || nome.length() == 0 || numeroRegistro <= 0) {
			throw new RuntimeException ("Dados invalidos de funcionário (Nome ou Numero Registro)");
		}*/
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public abstract float calcularSalario();
	

}
