import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String original = obj.next();
        String reverse = "";

        for(int i=0; i<original.length(); i++)
        {
            reverse+= original.charAt(original.length()-i-1);
        }

        System.out.println(reverse);
    }
}
