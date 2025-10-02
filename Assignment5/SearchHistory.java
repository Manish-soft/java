import java.util.*;

class SearchHistory{

public static void main(String[] agrs){

	Queue<String> recentsearchhistory = new LinkedList<>();
	
	recentsearchhistory.add("java");
	recentsearchhistory.add("python");
	recentsearchhistory.add("c++");
	recentsearchhistory.add("Dsa");
    recentsearchhistory.add("opp");
    recentsearchhistory.add("springboot");
   
   
   
   
   recentsearchhistory.poll();
   
   System.out.println("Recent seraches: "  +  recentsearchhistory );



}





}