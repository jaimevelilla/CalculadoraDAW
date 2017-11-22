package calculadoraDAW;

import java.util.Scanner;

public class calculadoraDAW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, division;

		System.out.println("primer numero");
		num1 = teclado.nextInt;
		System.out.println("segundo numero");
		num2 = teclado.nextInt;
		
		division = num1 / num2;
		
		System.out.println("el resultado de la división es "+ division);
	}

}
