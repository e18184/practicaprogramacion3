package estructuras;

import java.util.Stack;

public class Pila {
    public static void main(String args[]) {
        // pila vacia
        Stack<String> pila1 = new Stack<String>();
        pila1.push(new String("A"));
        pila1.push(new String("B"));
        pila1.push(new String("C"));
        pila1.push(new String("D"));
        /*
         * System.out.println(pila1.pop());
         * System.out.println(pila1.peek());
         */

        while (!pila1.isEmpty()) {
            System.out.println(pila1.peek());
            pila1.pop();

        }

    }
}
