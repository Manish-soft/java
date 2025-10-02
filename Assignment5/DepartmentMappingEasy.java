import java.util.*;

 class DepartmentMappingEasy {
    public static void main(String[] args) {

        Map<String, List<String>> dept = new HashMap<>();

    
        dept.put("IT", Arrays.asList("Amit", "Rohan"));
        dept.put("HR", Arrays.asList("Priya"));

   
        System.out.print("Department Structure: ");
        System.out.print("IT: " + String.join(", ", dept.get("IT")) + "; ");
        System.out.print("HR: " + String.join(", ", dept.get("HR")));
    }
}
