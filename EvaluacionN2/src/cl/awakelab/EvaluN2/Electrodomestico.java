package cl.awakelab.EvaluN2;

/**
* La clase Electrodomestico corresponde a la superclase de nuestro ejercicio y
* es la clase desde donde heredaran tanto la clase Lavadora como la
* clase Television.
* En esta clase instanciamos el precioBase de tipo float y cuyo valor por defecto
* es de 100000, el color de tipo String y que tiene un valor por defecto de
* blanco, el consumoEnergetico que es de tipo char y que comprende los
* caracteres desde A a F y por ultimo el peso que es tipo int y presenta un
* valor por defecto de 5 (kg).
* 
* @author Ana Luisa Medina analuisa.medina.r@gmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
*
*/

public class Electrodomestico {
	
	private final float PRECIO_BASE_DEFECTO=100000;
	private final String COLOR_DEFECTO="blanco";
	private final char CONSUMO_ENERGETICO_DEFECTO='F';
	private final int PESO_DEFECTO=5;
	
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	
	public Electrodomestico() {
		this.precioBase=PRECIO_BASE_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
		this.peso=PESO_DEFECTO;
		
	}
	
	public Electrodomestico(float precioBase, int peso) {
		this();
		this.precioBase=precioBase;
		this.peso=peso;
		
	}
	
	public Electrodomestico (float precioBase, int peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		this.color=comprobarColor(color);
		this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
		
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	/**
	 * El metodo comprobarConsumoEnergetico() realiza la comprobacion del
	 * consumoEnergetico del objeto ingresado, esto mediante la creacion de un
	 * arreglo eficiencia de tipo char que contiene todos los posibles valores
	 * y mediante la utilizacion de un bucle for que recorre el arreglo y que
	 * anida un sentencia if que compara los valores y que de ser igual returna
	 * el consumoEnergetico ingresado, ahora si no se cumple la sentencia if
	 * declarada retorna el CONSUMO_ENERGETICO_DEFECTO.
	 * 
	 * @return consumoEnergetico
	 */
	private char comprobarConsumoEnergetico (char consumo) {
		char [] eficiencia=new char[6];
		eficiencia[0]='A';
		eficiencia[1]='B';
		eficiencia[2]='C';
		eficiencia[3]='D';
		eficiencia[4]='E';
		eficiencia[5]='F';
		for(int i=0;i<eficiencia.length;i++) {
			if(consumo==eficiencia[i]) {
				return consumo;
			}
		}	
		return CONSUMO_ENERGETICO_DEFECTO;
	}
	
	/**
	 * El metodo comprobarColor() realiza la comprobacion del color del objeto
	 * ingresado, esto mediante la creacion de un arreglo llamado colores de
	 * tipo String que contiene todos los posibles valores y mediante la
	 * utilizacion de un bucle for que recorre el arreglo y que anida un
	 * sentencia if que compara los valores y que de ser igual returna el color
	 * ingresado, ahora si no se cumple la sentencia if declarada retorna el
	 * COLOR_DEFECTO.
	 * 
	 * @return consumoEnergetico
	 */
	private String comprobarColor(String color) {
		String [] colores=new String [5];
		colores[0]="blanco";
		colores[1]="negro";
		colores[2]="rojo";
		colores[3]="azul";
		colores[4]="gris";
		for(int i=0;i<colores.length;i++) {
			if(color.toLowerCase().equals(colores[i])){
				return color;
			}
		}
		return COLOR_DEFECTO;
	}
	
	/**
	 * El metodo precioFinal() modifica el valor del precioBAse
	 * mediante la variable valorRetorno la que se modifica segun de cumplan o
	 * no las sentencias if al interior de metodo.
	 * 
	 * @return valorRetorno
	 */
	public float precioFinal() {
		float valorRetorno=this.precioBase;
		if(this.consumoEnergetico=='A') {
			valorRetorno+=100;
		}else if(this.consumoEnergetico=='B'){
			valorRetorno+=80;
		}else if(this.consumoEnergetico=='C') {
			valorRetorno+=60;
		}else if(this.consumoEnergetico=='D') {
			valorRetorno+=50;
		}else if(this.consumoEnergetico=='E') {
			valorRetorno+=30;
		}else 
			valorRetorno+=10;
		
		if(this.peso>0 && this.peso<20) {
			valorRetorno+=10;
		}else if(this.peso>=20 && this.peso<50) {
			valorRetorno+=50;
		}else if(this.peso>=50 && this.peso<80) {
			valorRetorno+=80;
		}else
			valorRetorno+=100;
		
		return valorRetorno;
	}

}
