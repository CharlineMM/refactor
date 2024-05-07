public class Limites {
    protected int limiteInferior = 0;
    protected int limiteInferiorIntermedio = 0;
    protected int limiteSuperior = 0;

    public Limites(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public Limites() {
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public void setLimiteInferiorIntermedio(int limiteInferiorIntermedio) {
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
}
