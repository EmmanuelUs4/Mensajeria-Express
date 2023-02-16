public class Empleado extends Usuario {

    private String tiempoEnLaEmpresa;
    private String tipoDeSangre;

    private String tipoDeEmpleado;

    public Empleado(int cedula, String nombre, String apellidos, int celular, String correoElectronico, String direccionDeResidencia, String ciudad, String tiempoEnLaEmpresa, String tipoDeSangre, String tipoDeEmpleado) {
        super(cedula, nombre, apellidos, celular, correoElectronico, direccionDeResidencia, ciudad);
        this.tiempoEnLaEmpresa=tiempoEnLaEmpresa;
        this.tipoDeSangre=tipoDeSangre;
        this.tipoDeEmpleado=tipoDeEmpleado;
    }





}
