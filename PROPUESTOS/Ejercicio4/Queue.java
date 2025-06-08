public class Queue<E> {
    private Nodo<E> frente;
    private Nodo<E> fin;
    private int tamaño;
    private final int capacidadMaxima;

    public Queue(int capacidadMaxima) {
        this.frente = this.fin = null;
        this.tamaño = 0;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void encolar(E dato) {
        if (isFull()) {
            System.out.println("La cola está llena.");
            return;
        }
        Nodo<E> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        tamaño++;
    }

    public E desencolar() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        E dato = frente.dato;
        frente = frente.siguiente;
        tamaño--;
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    public E front() {
        if (isEmpty()) throw new RuntimeException("La cola está vacía");
        return frente.dato;
    }

    public E back() {
        if (isEmpty()) throw new RuntimeException("La cola está vacía");
        return fin.dato;
    }

    public void destroyQueue() {
        frente = fin = null;
        tamaño = 0;
        System.out.println("Cola destruida.");
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public boolean isFull() {
        return tamaño >= capacidadMaxima;
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
