import java.util.*;

class  StudentGradeManagement  {

    public static void main(String[] args) {

      
        Map<String, Integer> grades = new TreeMap<String, Integer>();

   grades.put("Manish", 85);
   grades.put("isha", 77);
 grades.put("kiran", 87);	 


System.out.println("Grade report:"); 
        System.out.println("Manish:"  + grades.get("Manish"));
    System.out.println("isha:"  + grades.get("isha"));
	System.out.println("kiran:"  + grades.get("kiran"));
	
	
	
	
	}
}
