public class Main {
    public static void main(String[] args) {
        QueueList<Integer> queue = new QueueList<>();

        for (int i = 1; i <= 8; i++) {
            queue.enqueue(i);
        }

        queue.printQueue();

        System.out.println("Elemento al frente: " + queue.peek());
        System.out.println("Elemento extraído: " + queue.dequeue());

        queue.printQueue();
    }
}
