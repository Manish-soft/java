import java.util.*;

class Groceryshoppinglist{

public static void main(String[] agrs){

List<String> list = new LinkedList<String>();

list.add("milk");
list.add("eggs");
list.add("bread");

System.out.println("Add items:"  + list);




System.out.println("purchase: milk");

list.remove("milk");

System.out.print("item to buy: "  + list);

}

}