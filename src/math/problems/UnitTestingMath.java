package math.problems;

import org.testng.Assert;



public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        //testing Fcatorial
       int fact =  Factorial.main(5);
       int number =120;

        try {
            Assert.assertEquals(fact, number, "factorial of 5 is not equals to "+number);
        }catch(Exception ex){
            ex.getMessage();
        }
       //testing findLowestDifference
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int lowest =FindLowestDifference.main( array1,array2);
        int low = 5;
        try {
            Assert.assertEquals(lowest, low, "the Lowest Dufference is not  "+low);
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
