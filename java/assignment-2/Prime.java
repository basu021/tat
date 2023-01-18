import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num, flag=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = input.nextInt();
        if(num < 2)
            System.out.println("Prime numbers are Starting from 2");
        else if(num == 2)
            System.out.println("The number is prime");
        else {
        for( int i=2;i*i<=num; i++ ) {
            if(num%i == 0) {
                flag = 0;
                System.out.println("The number is not prime");
                break;
            }
        }
        if(flag==1)
        System.out.println("The number is prime");
        }
    }
}
