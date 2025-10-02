 class Q14LinkedlistDel {

   
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

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        
        if (temp != null && temp.data == key) {
            head = temp.next; // Move head
            return;
        }

      
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

      
        if (temp == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }

  
        prev.next = temp.next;
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

        Q14LinkedlistDel list = new Q14LinkedlistDel();

       
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        System.out.println("Before deletion:");
        list.display();

    
        list.deleteNode(10);

        System.out.println("After deletion:");
        list.display();
    }
}
