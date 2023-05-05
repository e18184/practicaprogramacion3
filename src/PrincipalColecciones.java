import modelo.familia.*;
import java.util.Iterator;

public class PrincipalColecciones {
    public static void main(String[] args) {
        PadreC carlos = new PadreC("carlos", "perez", "cota", 30);
        HijoC mario = new HijoC("mario", "copa", "rios");
        HijoC mariano = new HijoC("mariano", "copa", "rios");
        HijoC jose = new HijoC("jose", "sadfa", "sfda");

        carlos.getHijos().add(mario);
        carlos.getHijos().add(mariano);
        carlos.getHijos().add(jose);

        System.out.println("Cuantos hijos tienes Carlos");
        System.out.println("yo tengo:" + carlos.getHijos().size());
        System.out.println("Y como se llaman tus hijos");
        for (HijoC o : carlos.getHijos())
            System.out.println("Mi hijo es:" + o.getNombre());

        System.out.println("----Ejemplo con un iterator----");
        for (Iterator<HijoC> it = carlos.getHijos().iterator(); it.hasNext();) {
            System.out.println("Mis hijos con iterator son:" + it.next().getNombre());

        }

    }

}
