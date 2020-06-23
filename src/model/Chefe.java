package model;

public class Chefe extends Funcionario{
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		if(salarioBase <= 0) {
			throw new RuntimeException ("Salário invalido (menor que R$ 0,00) para Chefe");
		}
		if(nome == null || nome.length() == 0 || numeroRegistro <= 0) {
			throw new RuntimeException ("Dados invalidos (Nome ou Numero Registro) para Chefe");
		}
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}


	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}


	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}
	

	

}
