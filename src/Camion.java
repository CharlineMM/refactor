public class Camion extends Limites {
    public Camion(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super(limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    public Camion() {
        this.limiteInferior = 75;
        this.limiteInferiorIntermedio = 76;
        this.limiteSuperior = 95;
    }
}
