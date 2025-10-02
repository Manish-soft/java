import java.util.*;

class Student {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Isha");
        list.add("Manish");
        list.add("Pekshu");

        System.out.println("Students are: " + list);

        list.remove("Manish");  

        System.out.println("Students are: " + list);
    }
}
