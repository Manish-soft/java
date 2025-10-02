import java.util.*;

class TextEditorSystem {
    public static void main(String[] args) {

     
        Stack<String> text = new Stack<>();

        text.push("Type A");
        text.push("Type B");
        text.push("Delete");

        text.pop();

       
        System.out.println("Current actions: " + text);
    }
}
