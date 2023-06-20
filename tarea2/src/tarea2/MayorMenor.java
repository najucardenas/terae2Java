package tarea2;

import java.util.Scanner;

public class MayorMenor {
	Scanner teclado=new Scanner(System.in);
	
	 MayorMenor(){
		 
		System.out.println("Escribe el primer nuemro: ");
		int uno=teclado.nextInt();
		
		 
	  System.out.println("Escribe el segundo numero");
	int dos=teclado.nextInt();
	
	  System.out.println("Escribe el tercer numero");
		int tres=teclado.nextInt();
		
		
		
		if(uno>dos && dos>tres) {
			
			System.out.println("el mayor es: "+uno+" el menor es "+tres);
			
			}
		else if(uno>tres && tres>dos) {
			
			System.out.println("el mayor es: "+uno+" el menor es "+dos);
			
			
		} else if(dos>uno && uno>tres) {
			
			System.out.println("el mayor es: "+dos+" el menor es "+tres);
			
			
		}  else if(tres>uno && uno>dos) {
			
			System.out.println("el mayor es: "+tres+" el menor es "+dos);
			
			
		}else if(tres>dos && dos>uno) {
			
			System.out.println("el mayor es: "+tres+" el menor es "+uno);
			
			
		}
		
		
		
		


	
	}

}
