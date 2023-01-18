import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int quot = a/b;
        int rem = a%b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        System.out.println("The difference of " + a + " and " + b + " is " + diff);
        System.out.println("The product of " + a + " and " + b + " is " + prod);
        System.out.println("The quotient of " + a + " and " + b + " is " + quot);
        System.out.println("The remainder of " + a + " and " + b + " is " + rem);
    }
}
