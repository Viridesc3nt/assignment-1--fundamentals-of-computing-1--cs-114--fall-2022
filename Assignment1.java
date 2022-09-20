import java.util.Scanner;

// Import libraries here

public class Assignment1 {
    public static void main(String[] args) {
        // Add your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("AAAAAAAAA   JJJJJJJJJ");
        System.out.print("AAA   AAA   JJJJJJJJJ");
        System.out.print("AAA   AAA      JJJ   ");
        System.out.print("AAAAAAAAA      JJJ   ");
        System.out.print("AAAAAAAAA      JJJ   ");
        System.out.print("AAAAAAAAA      JJJ   ");
        System.out.print("AAA   AAA   JJ JJJ   ");
        System.out.print("AAA   AAA    JJJ     ");

        //This is what the system is asking you to do and what to input.
        System.out.print("Please enter a 5-character string:");

        //input characters
        String str=sc.next();
        char ch=str.charAt(0);

        //prints out the Character
        System.out.println(+ch);
    }
}
