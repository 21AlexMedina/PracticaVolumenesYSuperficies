package Clases;
/**
 * Una clase Cubo que tiene los metodos de superficie y volumen
 */
public class Cubo {

	public int lado;
/**
 * Constructor que crea un cubo segun los parametros dados
 * @param lado
 */
	public Cubo(int lado) {
		this.lado = lado;
	}
	/**
	 * Un constructor que crea un cubo de lado, altura y profundidad de 1
	 */
	public Cubo() {
		this.lado = 1;
	}

	/**
	 * Un metodo que calcula la superficie del cubo
	 * 
	 * @return double
	 */
	public int superfice() {
		int resultado;

		resultado = (this.lado * this.lado) * 6;
		return resultado;
	}
	/**
	 * Un metodo que calcula la superficie del cubo
	 * 
	 * @return double
	 */
	public int volumen() {
		int resultado = this.lado * this.lado * this.lado;
		return resultado;

	}
}
