public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Insertar elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            pila.push(i);
        }

        pila.imprimirPila();

        // Mostrar y extraer el tope
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Elemento extraído: " + pila.pop());

        pila.imprimirPila();
    }
}
