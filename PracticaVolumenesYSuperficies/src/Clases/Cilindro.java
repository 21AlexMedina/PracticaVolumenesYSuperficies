package Clases;

/**
 * Clase de un Cilindro que calcula la superficie y el volumen
 */
public class Cilindro {

	double radio;
	double altura;

	/**
	 * Un constructor que recibe los parametros de radio y altura
	 * 
	 * @param radio
	 * @param altura
	 */
	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	/**
	 * Un constructor que no recibe parametros y crea un cilindro de radio y altura
	 * 1
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}

	/**
	 * Un metodo que calcula la superficie del cilindro
	 * 
	 * @return double
	 */
	public double superficie() {
		double resultado = (2 * 3.14 * this.radio * this.radio) + (2 * 3.14 * this.radio * this.altura);
		return resultado;
	}

	/**
	 * Un metodo que calcula la volumen del cilindro
	 * 
	 * @return double
	 */
	public double volumen() {
		double area = 3.14 * this.radio * this.radio;
		double volumen = area * this.altura;
		return volumen;
	}
}
