import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Queue<Integer> cola = new Queue<>(10);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Insertar elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            cola.encolar(i);
        }

        do {
            System.out.println("\n--- MENÚ COLA ---");
            System.out.println("1. Ver cola");
            System.out.println("2. Encolar");
            System.out.println("3. Desencolar");
            System.out.println("4. Ver frente");
            System.out.println("5. Ver final");
            System.out.println("6. Vaciar cola");
            System.out.println("7. ¿Está vacía?");
            System.out.println("8. ¿Está llena?");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cola.printQueue();
                    break;
                case 2:
                    if (cola.isFull()) {
                        System.out.println("Cola llena. No se puede encolar más elementos.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = scanner.nextInt();
                        cola.encolar(num);
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Elemento desencolado: " + cola.desencolar());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Elemento al frente: " + cola.front());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Elemento al final: " + cola.back());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    cola.destroyQueue();
                    break;
                case 7:
                    System.out.println(cola.isEmpty() ? "Sí, está vacía." : "No, tiene elementos.");
                    break;
                case 8:
                    System.out.println(cola.isFull() ? "Sí, está llena." : "No, hay espacio.");
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
