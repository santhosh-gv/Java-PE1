import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Enter integers...press e and enter to submit the integers");
        Scanner obj = new Scanner(System.in);
        int sum =0;

        while (obj.hasNextInt())
        {
            sum +=obj.nextInt();

        }
        System.out.println(sum);
    }
}
