package org.cofrinho;

// Classe abstrata Moeda
abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converterParaReal();
}