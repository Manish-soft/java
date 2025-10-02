 class Q13Linkedlist {


    static class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

   
    void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("prev_node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    
    void display() {
        Node n = head;
        System.out.print("LinkedList: ");
        while (n != null) {
            System.out.print(n.data + " ----> ");
            n = n.next;
        }
        System.out.println("null");
    }

 
    public static void main(String[] args) {
      
        Q13Linkedlist list = new Q13Linkedlist();

        
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

    
        System.out.println("Before insertion:");
        list.display();

        list.insertAfter(list.head.next, 25);

        System.out.println("After insertion:");
        list.display();
    }
}
