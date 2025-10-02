// Class for Linked List
class LL5 {
    // Start of the list (head node)
    Node head;

    // Node class inside LL5
    static class Node {
        int data;
        Node next;

        // Constructor to set data
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to add a node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);

        // Case: list is empty
        if (head == null) {
            head = new_node;
            return;
        }

        // Go to the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Link new node at the end
        last.next = new_node;
    }

    // Method to display the linked list
    void display() {
        Node n = head;
        System.out.print("LinkedList: ");
        while (n != null) {
            System.out.print(n.data + " ---> ");
            n = n.next;
        }
        System.out.println("null"); // Indicate end of list
    }
}
// Main class to run the program
 class Q11Linkedlist {
    public static void main(String[] args) {
        LL5 list = new LL5();

        // Insert initial elements
        list.append(5);
        list.append(10);
        list.append(15);

        // Insert new elements
        list.append(20);
        list.append(25);

        // Display the final linked list
        list.display();
    }
}





