package modelo.familia;

public class HijoC {
    private String nombre;
    private String ap;
    private String am;
    private PadreV p;

    public HijoC(String nombre, String ap, String am) {
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
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

    public PadreV getP() {
        return p;
    }

    public void setP(PadreV p) {
        this.p = p;
    }

}
