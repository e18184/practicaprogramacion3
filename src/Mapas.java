import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;

import modelo.familia.HijoC;

public class Mapas {
    public static void main(String args[]) {

        HijoC mario = new HijoC("mario", "copa", "rios");
        HijoC mariano = new HijoC("mariano", "copa", "rios");
        HijoC jose = new HijoC("jose", "sadfa", "sfda");
        HijoC daniela = new HijoC("daniela", "perez", "sea");
        HijoC felipe = new HijoC("felipe", "copa", "rios");

        /*
         * Set<HijoC> hijos = new HashSet<HijoC>();
         * hijos
         * hijos.add(mar.add(mario);iano);
         * hijos.add(jose);
         */

        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);
        mapa.put("cuatro", 4);
        mapa.put("cinco", 5);

        Map<String, HijoC> mapah = new HashMap<String, HijoC>();
        mapah.put("hijo1", mario);
        mapah.put("hijo2", mariano);
        mapah.put("hijo3", jose);
        mapah.put("hijo4", felipe);

        for (Entry<String, HijoC> a : mapah.entrySet()) {

            System.out.println(a.getKey() + " " + a.getValue().getNombre() + " " + a.getValue().getAp());

        }
        System.out.println("Visualizar enteros");

        for (Entry<String, Integer> b : mapa.entrySet()) {
            System.out.println(b);

        }

        /* Verificar si una llave esta en el mapa */
        HijoC otro = felipe;

        if (mapah.containsValue(otro)) {
            System.out.println("se encuentra");
        } else {
            System.out.println("No se encuentra");
        }

        /* Asignar los valores de un mapa a un list* */

    }
}
