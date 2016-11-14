package mx.com.everis.tallerJava.clase;

public class Persona {
final String nombre;

Persona(){
	
	nombre="vvv";
}

void getNombre(String nombre){
	
	nombre =nombre;
	//this.nombre=nombre; ***El this hace referencia a la variable declarada en la parte superior.
}

class Person{
	
	final void sing(){
		
		System.out.println("la..la..la..");
	}
}

}
