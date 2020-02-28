package cl.awakelab.EvaluN2;

/**
* La clase Television corresponde a la clase hija de Electrodomestico y de ella
* hereda las instanciaciones de precioBase, color, consumoEnergetico y peso.
* De manera aparte en esta clase se instancian la resolucion de tipo int cuyo
* valor por defecto es de 20 (pulgadas) y sintonizadorTDT de tipo booleano que
* tiene un valor por defecto de false.
* * 
* @author Ana Luisa Medina analuisa.medina.r@gmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
*
*/
public class Television extends Electrodomestico {
	
	private final int RESOLUCION_DEFECTO=20;
	private final boolean SINTONIZADOR_TDT_DEFECTO=false;
	
	private int resolucion;
	private boolean sintonizadorTDT;
	

	public Television() {
		super ();
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADOR_TDT_DEFECTO;
	}

	public Television(float precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADOR_TDT_DEFECTO;
	}

	public Television(float precioBase, int peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * El metodo precioFinal() modifica el valor del precioBAse
	 * mediante la variable valorRetorno la que se modifica segun de cumplan o
	 * no las sentencias if al interior de metodo.
	 * 
	 * @return valorRetorno
	 */
	public float precioFinal() {
		float valorRetorno=super.precioFinal();
		if(this.resolucion>40) {
			valorRetorno*=1.3;
		}
		
		if(this.sintonizadorTDT=true) {
			valorRetorno+=50;
		}
		return valorRetorno;
	}

}
