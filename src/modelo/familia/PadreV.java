package modelo.familia;

public class PadreV {
    private String nombre;
    private String ap;
    private String am;
    private int edad;
    private HijoV[] hijos = new HijoV[999];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public HijoV[] getHijos() {
        return hijos;
    }

    public void setHijos(HijoV[] hijos) {
        this.hijos = hijos;
    }

}
