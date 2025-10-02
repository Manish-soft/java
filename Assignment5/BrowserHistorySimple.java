import java.util.*;

 class BrowserHistorySimple {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

      
        history.push("Google");
        history.push("YouTube");
        history.push("GFG");

        history.pop();

        System.out.println("Current history: " + history);
    }
}
