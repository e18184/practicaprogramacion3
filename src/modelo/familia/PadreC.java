package modelo.familia;

import java.util.HashSet;
import java.util.Set;

public class PadreC {
    private String nombre;
    private String ap;
    private String am;
    private int edad;
    private Set<HijoC> hijos = new HashSet();

    public PadreC(String nombre, String ap, String am, int edad) {
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.edad = edad;
    }

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

    public Set<HijoC> getHijos() {
        return hijos;
    }

    public void setHijos(Set<HijoC> hijos) {
        this.hijos = hijos;
    }

}
