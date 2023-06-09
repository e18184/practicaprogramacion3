package estructuras;

import java.util.Queue;
import java.util.LinkedList;
//import java.util.Stack;

public class Cola {
    public static Queue<String> mostrar(Queue<String> cola) {
        Queue<String> aux = new LinkedList<String>();
        while (!cola.isEmpty()) {
            System.out.println(cola.peek());
            aux.offer(cola.peek());
            cola.remove();
        }
        return aux;
    }

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<String>();

        // Stack pila = new Stack<String>();

        //

        cola.offer("A");
        cola.offer("B");
        cola.offer("C");
        cola.offer("D");
        cola.offer("E");
        cola.offer("F");
        cola.offer("G");
        // cola.remove();

        mostrar(cola);

    }

}
