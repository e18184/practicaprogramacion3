package modelo;

public class Departamento {
    private String nombre;
    private Compania compania;
    private TiempoCompleto tiempocompleto;
    private Empleado[] empleado = new Empleado[100];

    public Departamento(String nombre, Compania compania, TiempoCompleto tiempocompleto, Empleado[] empleado) {
        this.nombre = nombre;
        this.compania = compania;
        this.tiempocompleto = tiempocompleto;
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public TiempoCompleto getTiempocompleto() {
        return tiempocompleto;
    }

    public void setTiempocompleto(TiempoCompleto tiempocompleto) {
        this.tiempocompleto = tiempocompleto;
    }

    public Empleado[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado[] empleado) {
        this.empleado = empleado;
    }

}
