import modelo.familia.*;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class PrincipalColecciones {
    public static void main(String[] args) {
        PadreC carlos = new PadreC("carlos", "perez", "cota", 30);
        HijoC mario = new HijoC("mario", "copa", "rios");
        HijoC mariano = new HijoC("mariano", "copa", "rios");
        HijoC jose = new HijoC("jose", "sadfa", "sfda");
        HijoC daniela = new HijoC("daniela", "perez", "sea");

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
        Set<HijoC> otracoleccion = new HashSet();
        otracoleccion.add(mario);
        otracoleccion.add(mariano);
        otracoleccion.add(daniela);

        if (carlos.getHijos().containsAll(otracoleccion))
            System.out.println("La estructura otracollecion es igual a los hijos de carlos");
        else
            System.out.println("No es igual");
        carlos.getHijos().addAll(otracoleccion);
        System.out.println("visualizamos adicionando otra coleccion");
        for (HijoC o : carlos.getHijos())
            System.out.println("Mi hijo es:" + o.getNombre());

        HijoC[] hijosc = new HijoC[10];
        // una forma
        hijosc = (HijoC[]) carlos.getHijos().toArray();

        // ejemplo de casteo
        int a;
        Byte b;
        // a = b;
        a = (int) b;

        // otra forma
        hijosc = carlos.getHijos().toArray(new HijoC[10]);

    }

}
