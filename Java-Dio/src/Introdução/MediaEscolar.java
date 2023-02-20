package Introdução;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
		double n1,n2,n3,n4,soma,media;
		System.out.println("Digite a sua primeira Nota Escolar");
		n1= leitor.nextDouble();
		System.out.println("Digite a sua segunda Nota Escolar");
		n2= leitor.nextDouble();
		System.out.println("Digite a sua terceira Nota Escolar");
		n3= leitor.nextDouble();
		System.out.println("Digite a sua quarta Nota Escolar");
		n4= leitor.nextDouble();
		soma=n1+n2+n3+n4;
		media=soma/4;
		System.out.println("sua media é: "+media);
				
	}

}

/*
Programa onde calcula suas 4 Notas Escolares e soma sua média.
 */