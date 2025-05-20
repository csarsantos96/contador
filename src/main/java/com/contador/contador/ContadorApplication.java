package com.contador.contador;

import com.contador.contador.exemplo.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
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

		// --- Parte 1: Contador
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		scanner.nextLine(); // Consumir quebra de linha pendente

		System.out.println("Contando de 1 até " + numero + ":");
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nFim da contagem!\n");

		// --- Parte 2: Entrada da tarefa
		System.out.print("Descrição da tarefa: ");
		String descricao = scanner.nextLine();

		System.out.print("Tarefa concluída? (true/false): ");
		boolean concluida = scanner.nextBoolean();
		scanner.nextLine(); // Consumir quebra de linha

		System.out.print("Pessoa responsável: ");
		String pessoa = scanner.nextLine();

		Tarefa tarefa = new Tarefa(descricao, concluida, pessoa);


		ObjectMapper mapper = new ObjectMapper();

		// Serializar
		String json = mapper.writeValueAsString(tarefa);
		System.out.println("\nJSON gerado: " + json);

		// Desserializar
		Tarefa novaTarefa = mapper.readValue(json, Tarefa.class);
		System.out.println("Objeto desserializado: " + novaTarefa);
	}
}
