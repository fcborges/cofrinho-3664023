package org.cofrinho;

// Subclasse Real
class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real | Valor: R$" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}