public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Camion camion = new Camion();
        Mula mula = new Mula();
        Comparendo comparendo =  new Comparendo(carro, camion, mula);
        comparendo.construirFotoMulta(80, "CARRO");
        comparendo.construirFotoMulta(200, "MULA");
        comparendo.construirFotoMulta(40, "CAMION");
        comparendo.construirFotoMulta(40, "AVION");
    }
}