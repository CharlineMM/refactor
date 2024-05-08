public class Vehiculo extends Limites {
    protected String tipo;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior, String tipo) {
        super(limiteInferior, limiteInferiorIntermedio, limiteSuperior);
        tipo = tipo.toLowerCase();
        if (tipo.equals("carro") || tipo.equals("camion") || tipo.equals("mula")) {
            this.tipo = tipo;
        }
        else {
            System.out.println("Ingrese tipo de vehiculo correcto");
        }
    }

    public Vehiculo(String tipo) {
        this.tipo = tipo.toLowerCase();
        switch (tipo) {
            case "carro": {
                this.limiteInferior = 65;
                this.limiteInferiorIntermedio = 66;
                this.limiteSuperior = 85;
                break;
            }
            case "camion": {
                this.limiteInferior = 75;
                this.limiteInferiorIntermedio = 76;
                this.limiteSuperior = 95;
                break;
            }
            case "mula": {
                this.limiteInferior = 95;
                this.limiteInferiorIntermedio = 96;
                this.limiteSuperior = 110;
                break;
            }
            default: {
                System.out.println("Ingrese tipo de vehiculo correcto");
            }
        }
    }
}
