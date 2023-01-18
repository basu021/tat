import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, t, r;
        System.out.print("Enter the principal amount: ");
        p = input.nextInt();
        System.out.print("Enter the time period: ");
        t = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        r = input.nextInt();
        input.close();
        System.out.println("The Simple interext is " + p*t*r/100 );
    }
}
