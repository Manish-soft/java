import java.util.*;


 class CommandHistoryTracker {
    public static void main(String[] args) {
        Queue<String> history = new LinkedList<>();

       
        history.add("ls");
        history.add("pwd");
        history.add("cd ..");

       
        history.poll();  // remove "ls"
        history.add("mkdir");

        System.out.print("Recent Commands: ");
        System.out.println(String.join(", ", history));
    }
}
