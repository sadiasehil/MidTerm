package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        String st ="minim";
        boolean isPal=Palindrome.isPalindrom(st);

        try {
            Assert.assertFalse(isPal==true , "the String is not plindrom");
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
