import java.util.*;

 class EvenRollNumber {
    public static void main(String[] args) {
       
        List<Integer> rollNumbers = Arrays.asList(101, 102, 103, 104);

        List<Integer> evenRollNumbers = new ArrayList<>();

   
        for (int roll : rollNumbers) {
            if (roll % 2 == 0) {
                evenRollNumbers.add(roll);
            }
        }


        System.out.println("Even Roll Numbers: " + evenRollNumbers);
    }
}
