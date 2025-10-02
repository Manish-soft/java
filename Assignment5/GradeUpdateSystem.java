import java.util.*;

class GradeUpdateSystem {

    public static void main(String[] args) {

      
        Map<String, Integer> grades = new HashMap<>();

    
        grades.put("Rohan", 78);

     
        grades.put("Rohan", 88);  // this replaces the old value

    
        System.out.println("Updated Grade:");
        System.out.println("Rohan: " + grades.get("Rohan"));
    }
}
