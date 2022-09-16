package ex02;

public class Salario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public Salario(String nome, double salario, double imposto) {
		this.nome = nome;
		this.salarioBruto = salario;
		this.imposto = imposto;
	}
	
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public void aumentaSalario(double aumento ) {
		this.salarioBruto += this.salarioBruto * aumento / 100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
