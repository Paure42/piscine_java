import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static final String WEEK = "Week ";
    private static final String END = "42";

    public static void main(String[] args) {
        Scanner   scanner = new Scanner(System.in);
        ArrayList<Long> grades = new ArrayList<>();
        for (int inc = 1; inc <= 18 && scanner.hasNext(); inc++) {
            String nl = scanner.nextLine();
            if (nl.equals(WEEK + inc)) {
                fill_grades(scanner, grades);
            } else if (nl.equals(END)) {
                break;
            } else {
                exit_error();
            }
        }
        print_graph(grades);
        scanner.close();
    }

    public static void exit_error() {
        System.err.print("Illegal argument\n");
        System.exit(-1);
    }

    public static void fill_grades(Scanner scanner, ArrayList<Long> grades) {
        int ni;
        long sum = 0;
        for (int i = 0; i < 5; i++)
        {
            ni = scanner.nextInt();
            if (ni < 1 || ni > 9)
                exit_error();
            sum = (sum * 10) + ni;
        }
        scanner.nextLine();
        grades.add(sum);
    }

    public static int get_min_grade(long grade) {
        long min = 9;

        while (grade > 0) {
            if ((grade % 10) < min)
                min = grade % 10;
            grade /= 10;
        }
        return ((int)min);
    }

    public static void print_graph(ArrayList<Long> grades) {
        int week = 1;
        int min_grade;
        for (long value : grades)
        {
            System.out.print("Week " + week + " ");
            min_grade = get_min_grade(value);
            while(min_grade-- > 0)
                System.out.print("=");
            System.out.print(">\n");
            week++;
        }
    }
}
