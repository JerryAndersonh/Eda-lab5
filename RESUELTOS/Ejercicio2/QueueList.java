public class QueueList<T> {
    private Node<T> front;
    private Node<T> rear;

    public QueueList() {
        this.front = this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Cola vacía");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Cola vacía");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        Node<T> current = front;
        System.out.print("Queue (front -> rear): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
