import java.util.*;

class RollNumberValidator{

public static void main(String[] agrs){

Set<Integer> rollno = new TreeSet<Integer>();

rollno.add(101);
rollno.add(102);
rollno.add(101);
rollno.add(103);

System.out.println("unique roll number:"  + rollno);




}



}