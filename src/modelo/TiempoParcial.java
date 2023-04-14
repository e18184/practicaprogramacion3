package modelo;

public class TiempoParcial extends Empleado {
    private Integer nroHoras;

    public Integer getNroHoras() {
        return this.nroHoras;
    }

    public void setNroHoras(Integer nroHoras) {
        this.nroHoras = nroHoras;
    }

    public TiempoParcial(String ci, String nombre, Departamento departamento, Integer nroHoras) {
        super(ci, nombre, departamento);
        this.nroHoras = nroHoras;
    }

}
