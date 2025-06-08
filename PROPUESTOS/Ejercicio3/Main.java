public class Main {
    public static void main(String[] args) {
        Queue<Integer> cola = new Queue<>();

        // Insertar elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            cola.enqueue(i);
        }

        cola.printQueue();

        // Ver el frente y extraer elementos
        System.out.println("Elemento en el frente: " + cola.front());
        System.out.println("Elemento extraído: " + cola.dequeue());

        cola.printQueue();
    }
}
