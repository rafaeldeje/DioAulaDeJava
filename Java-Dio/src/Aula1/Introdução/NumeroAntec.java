package Introdução;

import java.util.Scanner;

public class NumeroAntec {

        public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        double numero = leitor.nextDouble();
        System.out.println("o numero informado foi: "+(numero));
        System.out.println("o antecessor dele é: "+(numero-1));
        System.out.println("o sucessor dele é: "+(numero+1));
        
        }
    
    }