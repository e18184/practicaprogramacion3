package estructuras;

public class Pila {
    public static void main(String args[]) throws PilaVaciaException {
        // pila vacia
        PilaExcepciones<String> pila1 = new PilaExcepciones<String>();
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
        // System.out.println(pila1.peek());
        pila1.pop();

    }
}
