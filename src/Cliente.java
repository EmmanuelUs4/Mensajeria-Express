public class Cliente extends Usuario {

    private int cedula;
    private String nombre;
    private String apellidos;
    private int celular;
    private String correoElectronico;
    private String direccionDeResidencia;
    private String ciudad;
    public Cliente() {
    }

    public Cliente(int cedula, String nombre, String apellidos, int celular, String correoElectronico, String direccionDeResidencia, String ciudad) {
        super(cedula, nombre, apellidos, celular, correoElectronico, direccionDeResidencia, ciudad);
        this.ciudad=ciudad;
    }

}
