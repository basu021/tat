import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        input.close();
        if (number%2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
