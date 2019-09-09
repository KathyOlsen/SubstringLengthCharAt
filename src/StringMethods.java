import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = key.next();
        System.out.println("Enter a number as an index: ");
        int index = key.nextInt();

        System.out.println("The length of " + word + " is: " + word.length());
        if(index <= word.length()) {
            System.out.println("The substring from 0 to " + index + " is: " + word.substring(0, index));
        }else{
            System.out.println("Index is larger than length");
        }
    }
}
