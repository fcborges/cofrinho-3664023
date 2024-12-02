package org.cofrinho;

import java.util.ArrayList;

// Classe Cofrinho
class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Moeda adicionada!");
    }

    public void removerMoeda(int index) {
        if (index >= 0 && index < moedas.size()) {
            moedas.remove(index);
            System.out.println("Moeda removida!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio.");
            return;
        }
        for (int i = 0; i < moedas.size(); i++) {
            System.out.print(i + ": ");
            moedas.get(i).info();
        }
    }

    public void calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        System.out.println("Total em reais: R$" + total);
    }
}

