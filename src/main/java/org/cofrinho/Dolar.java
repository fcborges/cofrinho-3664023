package org.cofrinho;

// Subclasse Dolar
class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dólar | Valor: $" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.0; // Supondo cotação de R$5,00 por dólar
    }
}