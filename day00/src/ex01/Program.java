import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext())
        {
            int number = scan.nextInt();
            int iter = 1;
            boolean isprime = true;
            if (number < 2)
            {
                System.err.print("Illegal argument\n");
                scan.close();
                System.exit(-1);
            }
            for (int div = 2; div < number; div+=2)
            {
                if ((number % div) == 0)
                {
                    isprime = false;
                    break;
                }
                iter++;
            }
            System.out.printf("%s %d\n", isprime, iter);
        }
        scan.close();
        System.exit(0);
    }
}
