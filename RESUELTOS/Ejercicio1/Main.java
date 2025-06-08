public class Main {
    public static void main(String[] args) {
        StackList<Integer> stack = new StackList<>();

        // Ingresar los elementos del 1 al 8
        for (int i = 1; i <= 8; i++) {
            stack.push(i);
        }

        stack.printStack();

        // Probamos peek y pop
        System.out.println("Elemento en el tope: " + stack.peek());
        System.out.println("Elemento extraído: " + stack.pop());

        stack.printStack();
    }
}
