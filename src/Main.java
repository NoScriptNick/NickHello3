import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       //variables
       int num;

       System.out.println ("Please enter a 3 digit number: ");
       num = scan.nextInt();
       System.out.println(num / 100);
       int z = num/10;
       System.out.println(z % 10);
       System.out.println(num % 10);
    }
}