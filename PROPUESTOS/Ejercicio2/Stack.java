public class Stack<E> {
    private Nodo<E> cima;
    private int tamaño;
    private final int capacidadMaxima;

    public Stack(int capacidadMaxima) {
        this.cima = null;
        this.tamaño = 0;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void push(E dato) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede insertar.");
            return;
        }
        Nodo<E> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        E dato = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }

    public E top() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return cima.dato;
    }

    public void destroyStack() {
        cima = null;
        tamaño = 0;
        System.out.println("La pila ha sido destruida.");
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public boolean isFull() {
        return tamaño >= capacidadMaxima;
    }

    public void printStack() {
        Nodo<E> actual = cima;
        System.out.print("Pila (cima -> fondo): ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
