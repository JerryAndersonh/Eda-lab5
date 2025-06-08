import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>(10);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Insertamos los elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            pila.push(i);
        }

        do {
            System.out.println("\n--- MENÚ PILA ---");
            System.out.println("1. Ver pila");
            System.out.println("2. Insertar (push)");
            System.out.println("3. Extraer (pop)");
            System.out.println("4. Ver cima (top)");
            System.out.println("5. Vaciar pila (destroyStack)");
            System.out.println("6. ¿Está vacía?");
            System.out.println("7. ¿Está llena?");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pila.printStack();
                    break;
                case 2:
                    System.out.print("Ingrese un número: ");
                    int num = scanner.nextInt();
                    pila.push(num);
                    break;
                case 3:
                    try {
                        System.out.println("Elemento extraído: " + pila.pop());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Elemento en la cima: " + pila.top());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    pila.destroyStack();
                    break;
                case 6:
                    System.out.println(pila.isEmpty() ? "Sí, está vacía." : "No, tiene elementos.");
                    break;
                case 7:
                    System.out.println(pila.isFull() ? "Sí, está llena." : "No, hay espacio.");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
