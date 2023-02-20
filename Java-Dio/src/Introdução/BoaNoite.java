package Introdução;
import java.util.Scanner;
public class BoaNoite {

	public static void main(String[] args) {
		String nome;
		Scanner leitor = new Scanner(System.in);
		nome = leitor.next();
		System.out.println("Boa noite "+nome);

	}

}

/*
 1º importaremos a biblioteca do Scanner, em seguida denominamos o seu leitor.
"Scanner leitor = new Scanner(System.in);"
Ele irá pegar a resposta dita pelo Usuário no Terminal.

2º Depois de scanear o comando digitado pelo usuario, iremos usar o 
printf para obter o resuldado da contatenação.
 */