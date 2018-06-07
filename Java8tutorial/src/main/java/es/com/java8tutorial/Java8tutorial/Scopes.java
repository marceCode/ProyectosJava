package es.com.java8tutorial.Java8tutorial;

public class Scopes {
	
	
	private static double atributo1;
	private double atributo2;
	
	
	public double probarLocalVariable(){
		
		final double d3=3;
		Operacion op= new Operacion() {
			
			@Override
			public double calcularPromedio(double d1, double d2) {
			
				return d1+d2+d3;
			}
		};
		
		
		Operacion operacion=(x,y) ->{
			
			return x+y+d3;
			
		};
		
		return operacion.calcularPromedio(1, 1);
		
		
		
	}
	
	public double probarAtributosStaticVariables(){
	Operacion op= new Operacion() {
		
		@Override
		public double calcularPromedio(double d1, double d2) {
			atributo1=d1+d2;
			atributo2=atributo1;
			return atributo2;
		}
	};
		
		
		Operacion operacion=(x,y) ->{
			atributo1=x+y;
			atributo2=atributo1;
			return atributo2;
			
		};
		
		
		
		return operacion.calcularPromedio(1, 1);
		}

	
	public static void main(String[] args) {
		Scopes app= new Scopes();
		System.out.println(app.probarAtributosStaticVariables());
		
		
	}
}
