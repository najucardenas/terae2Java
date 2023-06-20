package tarea2;

import java.util.Scanner;

public class Saludo {
	Scanner teclado=new Scanner(System.in);
	
 Saludo(){
	 
	 
	 
	System.out.println("Escribe tu nombre: ");
	String nombre=teclado.next();
	
	 
  System.out.println("Escribe tu edad ");
int edad=teclado.nextInt();


System.out.println("Hola "+nombre+" tu edad es "+edad);
			
}

}
