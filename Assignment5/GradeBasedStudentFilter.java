import java.util.*;

class  GradeBasedStudentFilter {


public static void main(String[] agrs){

Map<String,Integer> grades = new LinkedHashMap<>();

grades.put("Manish",85);
grades.put("isha",52);
grades.put("kiran",75);

if(grades.get("isha") < 60){
grades.remove("isha");
}
 System.out.println("Honor Roll:");
        System.out.println("Amit: " + grades.get("Manish"));
        System.out.println("Rohan: " + grades.get("kiran"));






}




}