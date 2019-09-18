import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char sym = obj.next().charAt(0);

        if(sym>=65 && sym <= 90)
        {
            System.out.println("Capital Letter");
        }

        else if(sym>=97 && sym <= 122)
        {
            System.out.println("Small case letter");

        }
        else if(sym>=48 && sym <=57 )
        {
            System.out.println("Digit");

        }
        else
        {
            System.out.println("Special symbol");

        }

    }
}
