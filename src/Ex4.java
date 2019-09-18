import java.awt.*;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=0; j<i;j++)
            {
                System.out.print(i+" ");
            }

        }
    }
}
