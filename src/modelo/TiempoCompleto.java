package modelo;

public class TiempoCompleto extends Empleado {
    private Departamento[] departamento = new Departamento[10];

    public void setDepartamento(Departamento[] departamento) {
        this.departamento = departamento;
    }

    public Departamento[] getDepartamentos() {
        return departamento;
    }

    public TiempoCompleto(String ci, String nombre, Departamento departamento, Departamento[] departamento2) {
        super(ci, nombre, departamento);
        this.departamento = departamento2;
    }

}
