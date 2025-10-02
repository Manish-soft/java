 class Q18CountNodeOfLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;


    void insert(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void count() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("Total nodes: " + count);
    }

    
    void display() {
        Node temp = head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Q18CountNodeOfLinkedList list = new Q18CountNodeOfLinkedList();

        
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.display();

        list.count();
    }
}
