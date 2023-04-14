package modelo;

public class Compania {
    public String nombre;
    public Departamento[] departamento = new Departamento[100];

    public Compania(String nombre, Departamento[] departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento[] departamento) {
        this.departamento = departamento;
    }

    public int contarEmpleados() {
        int contarempleados =0;
        if (this.getDepartamento() != null) {
            for (int j = 0; j < this.getDepartamento().length; j++) {
                if (this.getDepartamento()[j].getEmpleado() != null) {
                    for (int k = 0; k < this.getDepartamento()[j].getEmpleado().length; k++) {
                        contarempleados = contarempleados + 1;
                    }
                }
        }
        /*esto es una nueva propuesta */

        return contarempleados;
    }

}
