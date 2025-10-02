import java.util.*;

class LibraryBookInventory {
    public static void main(String[] args) {

       
        Map<String, Integer> books = new LinkedHashMap<>();

  
        books.put("Java", 3);
        books.put("Python", 5);

    
        int javaCopies = books.get("Java");     
        books.put("Java", javaCopies - 1);     


        System.out.println("Current Inventory:");
        System.out.println("Java: " + books.get("Java"));     
        System.out.println("Python: " + books.get("Python")); 
    }
}
