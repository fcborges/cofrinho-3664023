package org.cofrinho;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

// Classe Principal com o menu
public class Menu {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar Moeda");
                System.out.println("2. Remover Moeda");
                System.out.println("3. Listar Moedas");
                System.out.println("4. Calcular Total em Reais");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        System.out.println("Escolha a moeda: 1. Real 2. Dólar 3. Euro");
                        int tipoMoeda = scanner.nextInt();
                       if(tipoMoeda > 3){
                           System.out.println("Opção inválida, selecione as opções 1,2 ou 3");
                       }else{
                           System.out.print("Digite o valor (use ponto para decimais): ");
                           double valor = scanner.nextDouble();

                           switch (tipoMoeda) {
                               case 1: cofrinho.adicionarMoeda(new Real(valor)); break;
                               case 2: cofrinho.adicionarMoeda(new Dolar(valor)); break;
                               case 3: cofrinho.adicionarMoeda(new Euro(valor)); break;
                               default: System.out.println("Tipo inválido!"); break;
                           }
                       }
                        break;
                    case 2:
                        cofrinho.listarMoedas();
                        System.out.print("Digite o índice da moeda a remover: ");
                        int index = scanner.nextInt();
                        cofrinho.removerMoeda(index);
                        break;
                    case 3:
                        cofrinho.listarMoedas();
                        break;
                    case 4:
                        cofrinho.calcularTotalEmReais();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Tente novamente.");
                scanner.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }
}
