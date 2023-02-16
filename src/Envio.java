public class Envio extends Cliente {
    private int numeroDeGuia;
    private String cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDeDestino;
    private String nombreRecetor;
    private int celularReceptor;
    private Double horaDeEntrega;
    private String estadoDelEnvio;
    private int valorDelEnvio;

    Paquete paquete;

    public void setCiudadDestino() {
        System.out.println(ciudadDestino = getCiudad());
    }

    public Envio(int numeroDeGuia,String cliente, String ciudadOrigen, String ciudadDestino,String direccionDeDestino, String nombreRecetor, int celularReceptor, Double horaDeEntrega, String estadoDelEnvio, int valorDelEnvio){
        this.numeroDeGuia=numeroDeGuia;
        this.cliente=cliente;
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.direccionDeDestino=direccionDeDestino;
        this.nombreRecetor=nombreRecetor;
        this.celularReceptor=celularReceptor;
        this.horaDeEntrega=horaDeEntrega;
        this.estadoDelEnvio=estadoDelEnvio;
        this.valorDelEnvio=valorDelEnvio;
    }


    public void informacionEnvio(){
        System.out.println("El número de guia del envío es:" +numeroDeGuia+".");
        System.out.println("Nombre del receptor: " + nombreRecetor+ ". Celular: "+ celularReceptor+".");
        System.out.println("Origen del envío: "+ciudadOrigen+ ". Destino del paquete: "+ciudadDestino+", a la direccion: "+direccionDeDestino+".");
        System.out.println("Valor del envío: " +valorDelEnvio+".");

    }



}
