package atividade1704;

import java.util.Scanner;

public class somaemedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int media, soma=0, num;
        
        for (int i = 1; i <= 5; i++) {
		System.out.println("informe o numero");
		num=ler.nextInt();
		
		soma+=num;
        }
		media = soma/5;
		
		System.out.println("a soma é: " +soma);
		System.out.println("A media é: " +media);
		
	}

}
