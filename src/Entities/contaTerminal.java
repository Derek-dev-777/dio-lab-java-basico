package Entities;

import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número!");
		int numero = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Agência!");
		sc.nextLine();
		String numeroAgencia = sc.nextLine();
		
		
		System.out.println("Por favor, digite o seu nome!");
		String nomeDoCliente = sc.nextLine();
		
		
		System.out.println("Por favor, digite o seu saldo!");
		Double saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeDoCliente, numeroAgencia, numero, saldo);
		

	}

}
