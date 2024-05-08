public class Main {

    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("carro");
        Vehiculo camion = new Vehiculo("camion");
        Vehiculo mula = new Vehiculo("mula");
        Comparendo comparendo =  new Comparendo(carro, camion, mula);
        comparendo.construirFotoMulta(80, "CARRO");
        comparendo.construirFotoMulta(200, "MULA");
        comparendo.construirFotoMulta(40, "CAMION");
        comparendo.construirFotoMulta(40, "AVION");
    }
}