package com.contador.contador.generics;

public class Avaliacao<T> {
    private T item;
    private int nota;
    private String comentario;

    public Avaliacao(T item, int nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Avaliação{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentário='" + comentario + '\'' +
                '}';
    }
}

