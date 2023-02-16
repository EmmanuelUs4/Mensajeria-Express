import java.util.Random;

public class Paquete {
    private String identificacionPaquete;
    private static String tipoDePaquete;
    private static int peso;
    private int valorDeclarado;

    public Paquete(String identificacionPaquete,int peso, String tipoDePaquete, int valorDeclarado) {
        this.identificacionPaquete = generadorIdentificacion();
        this.peso = peso;
        this.tipoDePaquete = validacionTipoDePaquete();

        this.valorDeclarado = valorDeclarado;
    }

    public static String validacionTipoDePaquete(){
        if (peso>=50){
            tipoDePaquete="GRANDE";
        } else if (peso>=20) {
            tipoDePaquete="MEDIANO";

        } else if (peso>=1) {
            tipoDePaquete="LIVIANO";
        }
        return "Tipo de paquete: " + tipoDePaquete;
    }

    public static String generadorIdentificacion(){
        String identificacion="";
        Random rnc= new Random();
        for (int i = 0; i < 7; i++)
        {
            if(i < 4)
            {
                identificacion += rnc.nextInt(10);
            }
            else
            {
                identificacion += (char)(rnc.nextInt(91) + 65);
            }
        }

       return identificacion;
    }

    public void informacionPaquete(){
        System.out.println("Identificador del paquete: " +generadorIdentificacion() +".");
        System.out.println("Peso: "+peso+" Kg. " + tipoDePaquete+".");
        System.out.println("Valor declarado: "+valorDeclarado);
    }

}
