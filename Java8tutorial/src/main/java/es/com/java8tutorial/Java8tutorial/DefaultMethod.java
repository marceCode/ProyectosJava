package es.com.java8tutorial.Java8tutorial;

public class DefaultMethod implements PersonaA, PersonaB {

	
	

	@Override
	public void caminar() {
		System.out.println("Hola Coders");
		
	}
	
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
	//	PersonaB.super.hablar();
		System.out.println("Subscribanse Coders");
	}


	public static void main(String[] args) {
		DefaultMethod app =new DefaultMethod();
		app.hablar();
		
		
		
		
	}
}
