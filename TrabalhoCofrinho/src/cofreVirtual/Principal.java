package cofreVirtual;

import java.util.Scanner;

/**
 * Classe Principal que controla a interação do usuário com o cofrinho de moedas.
  permite adicionar, remover, listar moedas e calcular o total em Reais.
 */
public class Principal {

    public static void main(String[] args) {
        // Criação do scanner para leitura de entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criação de uma instância da classe Cofrinho, que armazenará as moedas
        Cofrinho cofrinho = new Cofrinho();
        
        // Variável que controla a opção do menu
        int opcao = 0;

        // Estrutura de repetição para manter o programa em execução até o usuário escolher sair
        do {
            // Exibição do menu de opções
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Tratamento da opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    adicionarMoeda(cofrinho, scanner); // Método para adicionar moedas ao cofrinho
                    break;

                case 2:
                    removerMoeda(cofrinho, scanner); // Método para remover moedas do cofrinho
                    break;

                case 3:
                    cofrinho.listarMoedas(); // Exibe a lista de todas as moedas no cofrinho
                    break;

                case 4:
                    // Calcula e exibe o valor total do cofrinho convertido para Reais
                    System.out.println("Total em Reais: " + cofrinho.calcularTotalEmReais());
                    break;

                case 5:
                    System.out.println("Saindo..."); // Finaliza o programa
                    break;

                default:
                    System.out.println("Opção inválida."); // Trata entrada inválida do menu
            }

        } while (opcao != 5); // O programa continua enquanto a opção for diferente de 5 (Sair)

        scanner.close(); // Fechamento do scanner
    }

    
     // Método que permite ao usuário adicionar moedas ao cofrinho.
    
     
    private static void adicionarMoeda(Cofrinho cofrinho, Scanner scanner) {
        // Exibe as opções de tipos de moedas para o usuário
        System.out.println("Escolha o tipo de moeda: 1 - Real, 2 - Yen, 3 - Rupia");
        int tipo = scanner.nextInt();
        
        // Exibe as opções de valores para as moedas
        System.out.println("Escolha o valor da moeda: 1 - 1.00, 2 - 0.50, 3 - 0.25, 4 - 0.10, 5 - 0.05");
        int valorEscolhido = scanner.nextInt();

        // Seleciona o valor correspondente à escolha do usuário
        double valor = selecionarValor(valorEscolhido);

        // Cria uma moeda com o tipo e valor escolhido pelo usuário
        Moeda moeda = criarMoeda(tipo, valor);
        if (moeda != null) {
            cofrinho.adicionarMoeda(moeda); // Adiciona a moeda ao cofrinho
        } else {
            System.out.println("Tipo de moeda inválido."); // Caso o tipo de moeda seja inválido
        }
    }

    /**
     * Método que permite ao usuário remover uma moeda do cofrinho.
       cofrinho: De onde a moeda será removida
       scanner: Usado para capturar as entradas do usuário
     */
    private static void removerMoeda(Cofrinho cofrinho, Scanner scanner) {
        // Exibe as opções de tipos de moedas para o usuário
        System.out.println("Escolha o tipo de moeda: 1 - Real, 2 - Yen, 3 - Rupia");
        int tipo = scanner.nextInt();
        
        // Exibe as opções de valores para as moedas
        System.out.println("Escolha o valor da moeda: 1 - 1.00, 2 - 0.50, 3 - 0.25, 4 - 0.10, 5 - 0.05");
        int valorEscolhido = scanner.nextInt();

        // Seleciona o valor correspondente à escolha do usuário
        double valor = selecionarValor(valorEscolhido);

        // Cria a moeda que será removida
        Moeda moeda = criarMoeda(tipo, valor);
        if (moeda != null) {
            cofrinho.removerMoeda(moeda); // Remove a moeda do cofrinho
        } else {
            System.out.println("Tipo de moeda inválido."); // Caso o tipo de moeda seja inválido
        }
    }

    /**
     * Método auxiliar para selecionar o valor da moeda baseado na escolha do usuário.
       valorEscolhido: O valor selecionado pelo usuário
    
     */
    private static double selecionarValor(int valorEscolhido) {
        switch (valorEscolhido) {
            case 1:
                return 1.00;
            case 2:
                return 0.50;
            case 3:
                return 0.25;
            case 4:
                return 0.10;
            case 5:
                return 0.05;
            default:
                System.out.println("Valor inválido.");
                return -1; // Retorna -1 para indicar erro
        }
    }

    /**
     * Método auxiliar para criar uma moeda com base no tipo e valor escolhidos.
       tipo : O tipo da moeda (Real, Yen, Rupia)
       valor: O valor da moeda
       Uma instância da moeda correspondente
     */
    private static Moeda criarMoeda(int tipo, double valor) {
        switch (tipo) {
            case 1:
                return new Real(valor);
            case 2:
                return new Yen(valor);
            case 3:
                return new Rupia(valor);
            default:
                return null; // Retorna null caso o tipo seja inválido
        }
    }
}
