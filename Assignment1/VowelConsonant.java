import java.util.Scanner;

 class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);  // Convert to lowercase


        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        ? "Vowel"
                        : "Consonant";

        System.out.println(result);
    }
}
