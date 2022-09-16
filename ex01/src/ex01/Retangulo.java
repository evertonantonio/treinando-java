package ex01;

public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double area() {
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return (this.altura * 2) + (this.largura * 2);
	}
	
	

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
