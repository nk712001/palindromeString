import java.util.Scanner;

public class palindromeString {

        public static void main(String[] args) {
            String x;


            Scanner input = new Scanner(System.in);

            System.out.println("enter the String value: ");
            x=input.next();

            int i=0, j =x.length()-1;


            while (i<j){
                if (x.charAt(i)!=x.charAt(j)){
                    System.out.println(x+" is not a palindrome");
                    System.exit(0);
                }
                i++;
                j--;
            }
            System.out.println(x+" is a palindrome");
    }
}
