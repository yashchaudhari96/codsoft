import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter a text: ");
        
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();
        
        String[] words = inputText.split(" ");
        
        int wordCount = words.length;
        
        System.out.println("Total words: " + wordCount);
    }
}
