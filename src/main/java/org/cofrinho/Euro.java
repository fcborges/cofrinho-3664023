package org.cofrinho;

// Subclasse Euro
class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro | Valor: €" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.5; // Supondo cotação de R$5,50 por euro
    }
}