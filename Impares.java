package atividade1704;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, num;
		
		System.out.println("Digite o primeiro numero: ");
		numero = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num = ler.nextInt(); 
   
		for(int i = numero; i <= num; i++) {
			System.out.println();
			
		if (i % 2 == 1)  {
			System.out.println("Os numeros impares são: " +i);
	
		}
		else {
			System.out.println("O numero é par");
	    	}
		}
		{
      ler.close();
}
	}
	
	{
		
	}
	}