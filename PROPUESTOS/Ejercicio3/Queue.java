public class Queue<E> {
    private Nodo<E> frente;
    private Nodo<E> finalCola;

    public Queue() {
        this.frente = this.finalCola = null;
    }

    public void enqueue(E dato) {
        Nodo<E> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            frente = finalCola = nuevo;
        } else {
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        E dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return dato;
    }

    public E front() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return frente.dato;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void printQueue() {
        Nodo<E> actual = frente;
        System.out.print("Cola (frente -> final): ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
