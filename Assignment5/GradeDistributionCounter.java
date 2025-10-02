import java.util.*;

class GradeDistributionCounter {
    public static void main(String[] args) {

     
        Map<String, Integer> gradeCount = new HashMap<>();

       

        gradeCount.put("A", 1);

        
        gradeCount.put("B", 1);

       
        gradeCount.put("A", gradeCount.get("A") + 1);  // A = 2

      
        gradeCount.put("C", 1);

       
        gradeCount.put("B", gradeCount.get("B") + 1);  // B = 2

        gradeCount.put("A", gradeCount.get("A") + 1);  // A = 3

       
        System.out.println("Grade Distribution:");
        System.out.println("A = " + gradeCount.get("A"));
        System.out.println("B = " + gradeCount.get("B"));
        System.out.println("C = " + gradeCount.get("C"));
    }
}