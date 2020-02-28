package cl.awakelab.EjecEvN2;

import cl.awakelab.EvaluN2.*;

/**
* La clase Lista es la clase main desde donde ejecutamos el proyecto
* Evaluacion N2. En esta clase instanciamos un arreglo electrodomesticos con 
* objetos de la superclase Electrodomestico y sus hijas, la clase Lavadora y la
* clase Television.
* 
* @author Ana Luisa Medina analuisa.medina.r@gmail.com
* 
* @since Eclipse IDE for Enterprise Java Developers - 2019-12
*
*/

public class Lista {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos=new Electrodomestico[10];
		float valorTotal=0;
		
		electrodomesticos[0]=new Lavadora(120000, 40, "gris", 'A', 20);
		electrodomesticos[1]=new Television(130000, 20, "negro", 'B', 50, true);
		electrodomesticos[2]=new Lavadora(150000, 85, "rojo", 'B', 60);
		electrodomesticos[3]=new Electrodomestico(50000, 20, "azul", 'C');
		electrodomesticos[4]=new Television(80000, 40, "morado", 'D', 30, false);
		electrodomesticos[5]=new Electrodomestico(60000, 20, "rosado", 'L');
		electrodomesticos[6]=new Lavadora(200000, 90, "negro", 'A', 80);
		electrodomesticos[7]=new Television(40000, 10, "calipso", 'S', 50, true);
		electrodomesticos[8]=new Lavadora(134680, 50, "tuquesa", 'E', 30);
		electrodomesticos[9]=new Electrodomestico(35000, 50, "blanco", 'B');
		
		
		for(int i=0;i<electrodomesticos.length;i++) {

			if(electrodomesticos[i] instanceof Lavadora) {
				System.out.println("El precio de la lavadora es "+electrodomesticos[i].precioFinal());
			}	
		}
		System.out.println(" ");
		
		for(int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Television) {
				System.out.println("El precio de la television es "+electrodomesticos[i].precioFinal());
			}		
		}
		System.out.println(" ");
		
		for(int i=0;i<electrodomesticos.length;i++) {
			valorTotal+=electrodomesticos[i].precioFinal();		
		}
		System.out.println("El valor total de los electrodomesticos es "+valorTotal);
		

	}

}
