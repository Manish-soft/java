// Define the class
public class TeaCup {
    // Instance variable
    private String teaType;

    // Static variable
    static int totalcups = 0;

    // Constructor
    public TeaCup(String type) {
        teaType = type;
        totalcups++;
    }

    // Getter method
    public String getTeaType() {
        return teaType;
    }

    // Static method to show total cups
    static void showTotalcups() {
        System.out.println("Total cups: " + totalcups);
    }

    // main method
    public static void main(String[] args) {
        TeaCup cup1 = new TeaCup("Green Tea");
        TeaCup cup2 = new TeaCup("Black Tea");
        TeaCup cup3 = new TeaCup("Herbal Tea");

        System.out.println("Cup 1 contains: " + cup1.getTeaType());
        System.out.println("Cup 2 contains: " + cup2.getTeaType());
        System.out.println("Cup 3 contains: " + cup3.getTeaType());

        TeaCup.showTotalcups();
    }
}
