public abstract class Usuario {

    private int cedula;
    private String nombre;
    private String apellidos;
    private int celular;
    private String correoElectronico;
    private String direccionDeResidencia;
    private String ciudad;


    public Usuario() {
    }

    public Usuario(int cedula, String nombre, String apellidos, int celular, String correoElectronico, String direccionDeResidencia, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionDeResidencia = direccionDeResidencia;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCelular() {
        return celular;
    }

    public String getDireccionDeResidencia() {
        return direccionDeResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }
}
