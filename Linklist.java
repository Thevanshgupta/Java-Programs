class LinkedList {
    // Node class represents each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to initialize node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head (first node) of the linked list

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // List is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to delete a node with a given value
    public void delete(int data) {
        if (head == null) {
            System.out.println("The list is empty, no nodes to delete.");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted node with value " + data);
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        Node previous = null;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // If the node was not found
        if (current == null) {
            System.out.println("Node with value " + data + " not found.");
            return;
        }

        // Unlink the node from the list
        previous.next = current.next;
        System.out.println("Deleted node with value " + data);
    }

    // Method to display the contents of the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: Linked List: 10 -> 20 -> 30 -> null

        // Delete a node
        list.delete(20);
        list.display(); // Output: Linked List: 10 -> 30 -> null

        // Try to delete a non-existing node
        list.delete(40); // Output: Node with value 40 not found.
        list.display(); // Output: Linked List: 10 -> 30 -> null
    }
}
