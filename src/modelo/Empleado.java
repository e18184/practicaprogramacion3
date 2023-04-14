package modelo;

public abstract class Empleado {
    protected String ci;
    protected String nombre;
    /* True hombre False mujer */
    /* 1 hombre 0 mujer */
    protected Byte sexo;
    protected Byte edad;

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    protected Departamento departamento;

    public String getCi() {
        return this.ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado(String ci, String nombre, Departamento departamento) {
        this.ci = ci;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public Byte getSexo() {
        return sexo;
    }

    public void setSexo(Byte sexo) {
        this.sexo = sexo;
    }

}