import java.util.Scanner;

public class gitproject {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Integer number ");

        int n = ab.nextInt();
        for (int i = 1; i <= 10; i++)
         {
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}