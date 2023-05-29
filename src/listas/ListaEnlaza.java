package listas;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaEnlaza {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Seis");
        lista.add(3, "Cero");
        lista.remove(3);
        lista.set(5, "MODIFICADO");
        LinkedList<String> subconjunto = new LinkedList<String>();
        subconjunto.add("Uno");
        subconjunto.add("Dos");
        lista.addAll(subconjunto);
        lista.removeAll(lista);
        // System.out.println("---" + lista.remove());
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista no esta vacia");
        }

        /*
         * System.out.println("Elemento en la posicion 5");
         * System.out.println(lista.get(5).toString());
         */

        System.out.println("Visualizando la lista");
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);

        }
        /*
         * // inserta un elemento en una determinada posicion
         * lista.add(3, "NuevoElemento");
         * 
         * // for (String string : lista) {
         * System.out.println(lista);
         * // }
         * System.out.println("Elemento de la primera posicion:" + lista.getFirst());
         * 
         * // sacar un elemento en una determinada posicion
         * System.out.println("post elemento:" + lista.get(2));
         * 
         * // eliminar algo de la lista
         * lista.remove(3);
         * System.out.println(lista);
         * // adicionar al inicio
         * lista.addFirst("INICIO");
         * // adicionar al final
         * lista.addLast("FINAL");
         * System.out.println(lista);
         * // lista.clear();
         * System.out.println("borrado" + lista);
         * // mostrar un determinado elemento de la lista
         * System.out.println(lista.get(1));
         * 
         * LinkedList<String> nueva = new LinkedList<>();
         * nueva.add("a");
         * nueva.add("b");
         * nueva.add("c");
         * 
         * lista.addAll(1, nueva);
         * System.out.println(lista);
         * // si un elemento se encuentra dentro de la lista
         * if (lista.contains("W")) {
         * System.out.println("El elemento se encuentra");
         * } else {
         * System.out.println("El elemento no se encuentra");
         * }
         * lista.remove(2);
         * // containsAll verifica que exista una lista dentro de la otra
         * if (lista.containsAll(nueva)) {
         * System.out.println("La lista se encuentra");
         * } else {
         * System.out.println("La lista no se encuentra");
         * }
         * // saber en que posicion se encuentra
         * System.out.println("El elemento se encuentra en la posicion:" +
         * lista.indexOf("a"));
         * 
         */

    }

}
