package com.contatdor.contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		System.out.println("Contando de 1 até: " + numero +":");

		for (int i = 1; i <= numero; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nFim da contagem!");
	}
}
