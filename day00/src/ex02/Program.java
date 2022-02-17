import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while (scan.hasNext())
        {
            int number = scan.nextInt();
            if (number > 1)
            {
                int sum = 0;
                boolean isprime = true;
                while (number > 0)
                {
                    sum += number % 10;
                    number /= 10;
                }
                if (sum % 2 != 0)
                {
                    for (int div = 2; div < sum; div++)
                    {
                        if (sum % div == 0)
                        {
                            isprime = false;
                        }
                    }
                    if (isprime == true)
                        result++;
                }
            }
        }
        System.out.printf("Count of coffee-request - %d\n", result);
        scan.close();
    }
}
