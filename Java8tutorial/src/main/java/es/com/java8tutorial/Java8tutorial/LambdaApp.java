package es.com.java8tutorial.Java8tutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

	public void calcular(){
//		JDK 1.7
//		Operacion operacion= new Operacion() {
//			
//			@Override
//			public double calcularPromedio(double i1, double i2) {
//				return (i1+i2)/2;
//			}
//		};
//		
//		
//		
//		System.out.println(operacion.calcularPromedio(2, 3));
		
		Operacion operacion=(double x,double y) -> (x+y)/2;
		System.out.println(operacion.calcularPromedio(2, 3));
	}
	
	public void ordenar(){
		List<String> lista = new ArrayList<>();
		lista.add("Javi");
		lista.add("Vane");
		lista.add("Maura");
		
//		JDK 1.7
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
	
		
		Collections.sort(lista,(String p1, String p2) -> p1.compareTo(p2));
		
		for (String objetos : lista) {
			System.out.println(objetos);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		LambdaApp app= new LambdaApp();
		app.ordenar();
		app.calcular();

	}

}
