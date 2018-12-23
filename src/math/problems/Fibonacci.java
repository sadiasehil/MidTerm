package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int n=40;
        int i = 0;
        int j = 1;
        int temp;
        System.out.println(" The 40 Fibonacci numbers : ");
        for (int k = 0; k < n; k++)
        {
            System.out.print(i+", ");
            temp = i + j;
            i = j;
            j = temp;
        }

    }
}
