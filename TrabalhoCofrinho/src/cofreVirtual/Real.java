package cofreVirtual;


public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return this.valor; // Já está em Real
    }
}
