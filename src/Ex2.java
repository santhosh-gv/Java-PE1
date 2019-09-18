import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        if(num%2==0 && num>=20 && num<=30)
        {
            System.out.println("Jerry");
        }
        else if(num%2!=0 && num>=20 && num<=30)
        {
            System.out.println("Tom");
        }
    }
}
