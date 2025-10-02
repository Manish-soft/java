class Q16LinkedlistDel {

   
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

    
      void delete(int key) {
      Node temp = head;
        Node prev = null;

    if (head == null) {
        System.out.println("List is already empty.");
        return;
    }

  
    if (head.next == null) {
        head = null;
        return;
    }


  
    Node current = head;
    while (current.next.next != null) {
        current = current.next;  // move one node forward
    }

 
    current.next = null;
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

        Q16LinkedlistDel list = new Q16LinkedlistDel();

       
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        System.out.println("Before deletion:");
        list.display();

    
       

        System.out.println("After deletion:");
		list.delete(30);
        list.display();
    }
}
