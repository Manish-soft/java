import java.util.*;

class PrintJobManger{

public static void main(String[] agrs){


Queue<String> print = new LinkedList<>();


print.add("Doc1");
print.add("Doc1");
print.add("Doc1");

String printingjob = print.poll();

System.out.println("printing"  + printingjob);
System.out.println("queue"  + print);



}



}