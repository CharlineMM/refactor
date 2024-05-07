public class Carro extends Limites {
    public Carro(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super(limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    public Carro() {
        this.limiteInferior = 65;
        this.limiteInferiorIntermedio = 66;
        this.limiteSuperior = 85;
    }
}
