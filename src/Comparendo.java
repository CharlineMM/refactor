public class Comparendo {

    protected Carro carro;
    protected Camion camion;
    protected Mula mula;

    // Constructor completo
    public Comparendo(Carro carro, Camion camion, Mula mula) {
        this.carro = carro;
        this.camion = camion;
        this.mula = mula;
    }

    // Que sentido tiene este constructor?
    /*public Comparendo(int limiteInferiorCarro) {
        this.limiteInferiorCarro = limiteInferiorCarro;
    }*/

    // Constructor vacio
    public Comparendo() {
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int cpa = calcularComparendo(velocidad, tipoVehiculo);
        String txt = enviarCorreoFotomulta(tipoVehiculo);
        if(cpa == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + txt);
        }else {
            System.out.println("----el tipo de comparendo es: " + cpa + " ----cuerpo del correo" + txt);
        }

    }

    public int calcularComparendo(int ve, String tp) {

        if(tp == "CARRO") {
            if(ve<=carro.limiteInferior) {
                return 0;
            }else if (ve >=carro.limiteInferiorIntermedio && ve<=carro.limiteSuperior) {
                return 1;
            }
            return 2;
        }

        if(tp == "CAMION") {
            if(ve<=camion.limiteInferior) {
                return 0;
            }else if (ve >=camion.limiteInferiorIntermedio && ve<=camion.limiteSuperior) {
                return 1;
            }
            return 2;
        }

        if(tp == "MULA") {
            if(ve<=mula.limiteInferior) {
                return 0;
            }else if (ve >=mula.limiteInferiorIntermedio && ve<=mula.limiteSuperior) {
                return 1;
            }
            return 2;
        }

        return -1;
    }


    public String enviarCorreoFotomulta(String tipoVehiculo) {

        if(tipoVehiculo == "CAMION") {
            String cuerpoMensaje = "//enviando correo para el tipo camion.";
            String asunto = "//asunto: comparendo camion";
            return   asunto + cuerpoMensaje;
        }else if(tipoVehiculo == "CARRO") {
            String cuerpoMensaje = "//enviando correo para el tipo carro.";
            String asunto = "//asunto: comparendo carro";
            return   asunto + cuerpoMensaje;
        }else if(tipoVehiculo == "MULA") {
            String cuerpoMensaje = "//enviando correo para el tipo mula.";
            String asunto = "//asunto: comparendo mula";
            return   asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }

}
