package com.contador.contador.exemplo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class EscritorTarefa {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar Spring", false, "César");

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("tarefa.json"), tarefa);
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}
