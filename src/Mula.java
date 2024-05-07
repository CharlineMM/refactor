public class Mula extends Limites {
    public Mula(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super(limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    public Mula() {
        this.limiteInferior = 95;
        this.limiteInferiorIntermedio = 96;
        this.limiteSuperior = 110;
    }
}
