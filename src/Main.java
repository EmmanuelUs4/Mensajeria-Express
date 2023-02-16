public class Main {
    public static void main(String[] args) {

    Cliente cliente1= new Cliente(1234567890, "Balduino", "IV", 313, "Balduino@gmail.com", "Carrera 90", "Medellin");
    Envio envioCliente1= new Envio(1234555, "Balduino IV","Rionegro", "Medellin", "Carrera 90","Balduino",31369476,21.30, "En ruta", 1000);
    envioCliente1.informacionEnvio();

    Paquete paqueteEnvio1= new Paquete(Paquete.generadorIdentificacion(), 9, Paquete.validacionTipoDePaquete(), 100);
    paqueteEnvio1.informacionPaquete();

    }
}