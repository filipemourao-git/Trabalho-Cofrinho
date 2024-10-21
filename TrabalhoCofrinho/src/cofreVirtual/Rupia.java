package cofreVirtual;

public class Rupia extends Moeda {

    public Rupia(double valor) {
        super(valor);
    }

 
    public double converterParaReal() {
        return this.valor * 0.012; // Taxa de conversão 1 Rupia = 0.012 Reais
    }
}
