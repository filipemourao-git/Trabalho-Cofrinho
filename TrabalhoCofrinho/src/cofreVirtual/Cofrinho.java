package cofreVirtual; 


import java.util.ArrayList;

/**
 * A classe Cofrinho representa um cofre de moedas, onde é possível adicionar, remover,
   Lista e calcula o valor total das moedas convertidas para Reais.
   Utiliza uma coleção (ArrayList) para armazenar objetos do tipo Moeda.
 */
public class Cofrinho {
    // Coleção para armazenar as moedas
    private ArrayList<Moeda> moedas;

    
     // Construtor da classe Cofrinho. Inicializa a coleção de moedas como um ArrayList vazio.
     
    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

   // Adiciona uma moeda ao cofrinho.
  
    public void adicionarMoeda(Moeda moeda) {
        // Adiciona a moeda à lista de moedas
        moedas.add(moeda);
        // Exibe mensagem indicando que a moeda foi adicionada
        System.out.println(moeda.toString() + " adicionada.");
    }

   
    //Remove uma moeda específica do cofrinho.
    
    public void removerMoeda(Moeda moeda) {
        // Verifica se a moeda existe na lista e tenta removê-la
        if (moedas.remove(moeda)) {
            // Se a remoção for bem-sucedida, exibe mensagem confirmando
            System.out.println(moeda.toString() + " removida.");
        } else {
            // Se a moeda não for encontrada, exibe mensagem de erro
            System.out.println("Moeda não encontrada.");
        }
    }

    
     // Lista todas as moedas presentes no cofrinho.
    
    public void listarMoedas() {
        // Verifica se o cofrinho está vazio
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio."); // Exibe mensagem se não houver moedas
        } else {
            // Itera sobre a lista de moedas e exibe cada uma
            for (Moeda moeda : moedas) {
                System.out.println(moeda.toString());
            }
        }
    }

    /**
     * Calcula o valor total de todas as moedas no cofrinho, convertendo-as para Reais.
     * 
     * Retorna O valor total das moedas convertidas para Reais.
     */
    public double calcularTotalEmReais() {
        double total = 0; // Inicializa a variável que armazenará o total
        // Itera sobre todas as moedas e acumula o valor convertido para Reais
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total; // Retorna o valor total
    }
}
