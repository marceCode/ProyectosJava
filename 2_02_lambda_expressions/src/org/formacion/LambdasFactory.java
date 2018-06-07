package org.formacion;


/**
 * El ejercicio consiste en implementar los metodos de tal forma que 
 * devuelvan una lambda expression que implementen la interface declarada
 * como tipo de devoluci�n.
 * 
 * Por ejemplo
 * 
 * El primer metodo devuelve un objeto del tipo Constante
 * En la parte inferior de este fichero encontrareis la definicion de Constante
 * que tiene un metodo abstract:
 *    int valor();
 *    
 * Por tanto, vuestra implementacion del metodo devuelve5 debe tener la forma:
 *    return lambda_expression;
 * 
 * Donde lambda_expression es una implementaci�n del m�todo int valor() que siempre
 * devuelve 5
 * 
 */
public class LambdasFactory {

	
	/** Devuelve una implemtacion de constante que siempre devuelve 5 */
	public Constante devuelve5() {
		//int valor();
		return ()->5;
	}

	/** Devuelve una implementacion de Operador con el metodo de suma de dos enteros */
	public Operador obtenSumador() {
		return (a,b)->a+b;
	}
	
	/** 
	 * Devuelve un inicializador de un array de strings
	 * El metodo inicializa recibe el array ya creado. Su tarea es que 
	 * todas las posiciones queden inicializadas con el valor indicado en el
	 * seguno parametro del metodo incializa
	 */
	public InicializadorArrays obtenInicializador() {
		// String[] array, String valor
		return (array, valor)->{
			
			for (int i = 0; i < array.length; i++) {
				array[i]=valor;
				System.out.println(array[i].toString());
			}
		};
	}
	
}

interface Constante {
	int valor();
}

interface Operador {
	int opera ( int a, int b);
}

interface InicializadorArrays {
	void inicializa ( String[] array, String valor)  ;
}

 interface Comparator <T> {
	// Se eluden los m�todos default y est�ticos
	int compare(T o1, T o2);
	// El m�todo equals(Object obj) es implicitamente implementado por la clase objeto.
	boolean equals(Object obj);
}