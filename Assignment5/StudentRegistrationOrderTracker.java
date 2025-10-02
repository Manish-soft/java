import java.util.*;

class StudentRegistrationOrderTracker {

    public static void main(String[] args) {

      
        Map<String, Integer> registrations = new LinkedHashMap<>();

      
        registrations.put("Amit", 101);
        registrations.put("Rohan", 102);
        registrations.put("Priya", 103);

       
        System.out.println("Registration Order:");
        System.out.println("Amit: " + registrations.get("Amit"));
        System.out.println("Rohan: " + registrations.get("Rohan"));
        System.out.println("Priya: " + registrations.get("Priya"));
    }
}

