import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();
        int n= num ;
        int sum =0;
        int evSum =0;

        while(n>0)
        {
            if((n%10)%2==0)
            {
                evSum+=n%10;
            }
            sum+=n%10;
            sum*=10;
            n/=10;
        }

        sum/=10;
        if (sum == num)
        {
            System.out.print(num + " is a palindrome");
            if(evSum>25)
            {
                System.out.print(" and the sum of even numbers is greater than 25");
            }

            else
            {
                System.out.print(" and the sum of even numbers is lesser than 25");
            }

        }
        else {
            System.out.println(num + " is not a palindrome");
        }

    }

}
