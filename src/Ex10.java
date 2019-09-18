import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String original = obj.next();


        Scanner obj2 = new Scanner(System.in);
        int n = obj2.nextInt();

        String two = original.substring(original.length()-n);

        System.out.print(original);
        for (int j = 0; j < n; j++)
        {
            System.out.print(two);
        }
    }
}
