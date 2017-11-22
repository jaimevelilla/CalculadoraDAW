package calculadoraDAW;

import java.util.Scanner;
<<<<<<< HEAD

=======
>>>>>>> 1633f83d73524065b53a9084c4d7fb34d98c7a9c
public class calculadoraDAW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
<<<<<<< HEAD
		int num1, num2, division;

		System.out.println("primer numero");
		num1 = teclado.nextInt;
		System.out.println("segundo numero");
		num2 = teclado.nextInt;
		
		do{ System.out.println("el segundo número no puede ser 0");
		num2 = teclado.nextInt;}
			while{num2==0}
	
		division = num1 / num2;
		
		System.out.println("el resultado de la división es "+ division);
	}

}
=======
		int n1, n2, resta;
		System.out.println("Escribe un número del 1 al 9");
		n1 = teclado.nextInt();
	
		
		System.out.println("Escribe un número del 1 al 9");
		n2 = teclado.nextInt();
		resta = n1-n2;
		System.out.println("La resta de " + n1 + " y " + n2 + " es " + resta);
		//multiplicacion
		System.out.println("Escribe un número del 1 al 9");
		n1 = teclado.nextInt();
	
		
		System.out.println("Escribe un número del 1 al 9");
		n2 = teclado.nextInt();
		resta = n1-n2;
		System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es: " + n1*n2);
	} //main
	
} //class
>>>>>>> 1633f83d73524065b53a9084c4d7fb34d98c7a9c
