package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        int n = 50;
        printPyramid(n);
    }
        public static void printPyramid(int n)
        {
            // number of spaces
            int k = 2*n - 2;

            for (int i=0; i<n; i++)
            {

                for (int j=0; j<k; j++)
                {
                    // printing spaces
                    System.out.print(" ");
                }

                // decrementing k after each loop
                k = k - 1;

                for (int j=0; j<=i; j++ )
                {
                    // printing stars
                    System.out.print("* ");
                }

                // ending line after each row
                System.out.println();
            }
        }


        }

