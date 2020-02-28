package cl.awakelab.EvaluN2;

/**
* La clase Lavadora corresponde a la clase hija de Electrodomestico y de ella
* hereda las instanciaciones de precioBase, color, consumoEnergetico y peso.
* De manera aparte en esta clase se instancian la carga de tipo int cuyo valor
* por defecto es de 5 (kg).
* 
* @author Ana Luisa Medina analuisa.medina.r@gmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
* 
*/
public class Lavadora extends Electrodomestico {
	
	private final int CARGA_DEFECTO=5;
	
	private int carga;

	public Lavadora() {
		super();
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(float precioBase, int peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga=carga;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * El metodo precioFinal() modifica el valor del precioBAse
	 * mediante la variable valorRetorno la que se modifica en caso de
	 * cumplirse la sentencia if al interior de metodo.
	 * 
	 * @return valorRetorno
	 */
	public float precioFinal() {
		float valorRetorno=super.precioFinal();
		if(this.carga>30) {
			valorRetorno+=50;			
		}
		return valorRetorno;
	}
	

}
