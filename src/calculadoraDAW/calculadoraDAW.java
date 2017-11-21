package calculadoraDAW;

import java.util.Scanner;
public class calculadoraDAW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n1, n2, resta;
		System.out.println("Escribe un número del 1 al 9");
		n1 = teclado.nextInt();
	
		
		System.out.println("Escribe un número del 1 al 9");
		n2 = teclado.nextInt();
		resta = n1-n2;
		System.out.println("La resta de " + n1 + " y " + n2 + " es " + resta);
		
	} //main
	
} //class
