import java.util.*;

class AttendanceTrackingSystem {

    public static void main(String[] args) {

   
        Map<String, Integer> attendance = new TreeMap<>();

        attendance.put("Amit", 90);
        attendance.put("Rohan", 85);
        attendance.put("Priya", 95);

 
        System.out.println("Attendance Report:");
        System.out.println("Amit: " + attendance.get("Amit"));
        System.out.println("Priya: " + attendance.get("Priya"));
        System.out.println("Rohan: " + attendance.get("Rohan"));
    }
}



