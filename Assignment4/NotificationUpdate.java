import java.util.Scanner; 

class NotificationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner to read input

        System.out.println("Enter the original sentence:");
        String original = sc.nextLine();

     
        System.out.println("Enter the word to replace:");
        String find = sc.nextLine();

        System.out.println("Enter the new word:");
        String replace = sc.nextLine();

      
        StringBuilder message = new StringBuilder(original);

        int index = message.indexOf(find);

   
        if (index != -1) {
            message.replace(index, index + find.length(), replace);
        } else {
            System.out.println("Word not found.");
        }

     
        System.out.println("Updated sentence: " + message);

        
    }
}
