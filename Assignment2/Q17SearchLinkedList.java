 class Q17SearchLinkedList {

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

   
    void search(int key) {
        Node current = head;
        int index = 0;

       
        while (current != null) {
            if (current.data == key) {
                System.out.println("Element found at index " + index);
                return;
            }
            current = current.next;
            index++;
        }

      
        System.out.println("Element not found in the list.");
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
        Q17SearchLinkedList list = new Q17SearchLinkedList();

        
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.display();

        list.search(30); 
    }
}
