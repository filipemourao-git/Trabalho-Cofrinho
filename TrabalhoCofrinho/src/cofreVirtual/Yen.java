package cofreVirtual;

public class Yen extends Moeda {

    public Yen(double valor) {
        super(valor);
    }

  
    public double converterParaReal() {
        return this.valor * 0.035; // Taxa de conversão 1 Yen = 0.035 Reais
    }
}
