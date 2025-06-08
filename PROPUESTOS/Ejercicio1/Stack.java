public class Stack<E> {
    private Nodo<E> cima;

    public Stack() {
        this.cima = null;
    }

    public void push(E elemento) {
        Nodo<E> nuevo = new Nodo<>(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public E pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        E dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public E peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return cima.dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void imprimirPila() {
        Nodo<E> actual = cima;
        System.out.print("Pila (cima -> fondo): ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
