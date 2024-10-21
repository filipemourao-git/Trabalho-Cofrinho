package cofreVirtual;

/**
 * A classe abstrata Moeda define a estrutura básica de uma moeda.
 * As subclasses  Real, Yen e Rupia irão herdar desta classe
 * e implementar o método abstrato converterParaReal.
 */

public abstract class Moeda {
	
	  // O valor da moeda
    public double valor;

    //Construtor da classe Moeda.
    public Moeda(double valor) {
        this.valor = valor;//valor O valor monetário da moeda.
    }

    public double getValor() {
        return valor;//Retorna o valor da moeda.
    }
    
    //Método abstrato implementado por subclasses para converter o valor da moeda para Reais.
    public abstract double converterParaReal();

    /**
     * Sobrescreve o método toString para retornar uma representação textual da moeda.
     * Inclui o nome da classe (tipo de moeda) e o valor.
     * 
     * retorna Uma string que representa a moeda.
     */
    
    public String toString() {
        return this.getClass().getSimpleName() + " - Valor: " + valor;
    }
}
