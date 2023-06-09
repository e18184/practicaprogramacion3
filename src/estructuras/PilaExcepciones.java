package estructuras;

import java.util.Stack;

public class PilaExcepciones<E> {
    private Stack<E> stack;

    public PilaExcepciones() {
        stack = new Stack<>();
    }

    public void push(E item) {
        stack.push(item);
    }

    public E pop() throws PilaVaciaException {
        if (isEmpty()) {
            throw new PilaVaciaException("No se puede borrar un elemento de una pila vacía");
        }
        return stack.pop();
    }

    public E peek() throws PilaVaciaException {
        if (isEmpty()) {
            throw new PilaVaciaException("No se puede acceder a la cima de la pila vacía");
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
