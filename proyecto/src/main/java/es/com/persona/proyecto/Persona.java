package es.com.persona.proyecto;

/**
 * The Class Persona.
 */
public class Persona {
	
	//Constantes
	private final static char SEXO_DEF='H';
	/**
     * El peso de la persona esta por debajo del peso ideal
     */
    public static final int INFRAPESO = -1;
 
    /**
     * El peso de la persona esta en su peso ideal
     */
    public static final int PESO_IDEAL = 0;
 
    /**
     * El peso de la persona esta por encima del peso ideal
     */
    public static final int SOBREPESO = 1;
    
    
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	
	
	public Persona() {
		this("", 0, 0, 0, SEXO_DEF);
		
	}


	public Persona(String nombre, int edad, double peso, double altura, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		 //generarDni();
	        this.sexo = sexo;
	    //    comprobarSexo();
	}
	
	public Persona(String nombre, int edad,  char sexo) {
		this(nombre, edad, 0, 0, sexo);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	public void calcularIMC(){
		
		/* calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
		 *  si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, 
		 *  si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal
		 *   la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, 
		 *   la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.*/
		
	}
	
	
	
}
