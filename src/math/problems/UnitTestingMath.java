package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        //testing Fcatorial
       int fact =  Factorial.main(5);
        Assert.assertEquals(fact, 120 );
       //testing findLowestDifference
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int lowest =FindLowestDifference.main( array1,array2);
        Assert.assertEquals(lowest,1);
    }
}
