package com.contador.contador.exemplo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class LeitorTarefa {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try (InputStream inputStream = LeitorTarefa.class
                .getClassLoader()
                .getResourceAsStream("tarefa.json")) {

            Tarefa tarefa = mapper.readValue(inputStream, Tarefa.class);
            System.out.println(tarefa);

        } catch (IOException e) {
            System.out.println("Erro ao ler tarefa.json: " + e.getMessage());
        }
    }
}
