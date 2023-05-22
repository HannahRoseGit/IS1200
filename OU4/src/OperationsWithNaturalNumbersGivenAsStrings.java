import java . util .*; // Scanner
import static java . lang . System . out;

public class OperationsWithNaturalNumbersGivenAsStrings
{
    public static void main ( String [] args )
    {
        out . println (" OPERATIONS ON NATURAL NUMBERS " +
                "IN CHARACTER STRINGS ");
// enter two natural numbers
        Scanner in = new Scanner ( System .in );
        out . println ("two natural numbers :");
        String tal1 = in. next ();
        String tal2 = in. next ();
        out . println ();
// add the numbers and show the result
        String sum = add (tal1 , tal2 );
        show (tal1 , tal2 , sum , '+');
// subtract the numbers and show the result
        String sub = subtract (tal1 , tal2 );
        show (tal1 , tal2 , sub , '-');
// *** WRITE YOUR CODE HERE ***
    }
    // The add method accepts two natural numbers represented
// as character strings and returns their sum as a
// character string .
    public static String add ( String num1 , String num2 )
    {
       while(num1.length() < num2.length()){
           num1 = "0" + num1;
       }
       while(num1.length() > num2.length()) {
           num2 = "0" + num2;
       }
       //declaring the carry
       int c = 0;
        String resultInt = "";

       // adding
        for (int i =1; i <= num1.length(); i++){
            int in1 = Character.getNumericValue(num1.charAt(num1.length()-i));
            int in2 = Character.getNumericValue(num2.charAt(num2.length()-i));
            int sum = c + in1 + in2;
            c = sum / 10;
            resultInt = (sum % 10) + resultInt;
        }
        if (c >0){
            resultInt = c + resultInt;
        }
        return resultInt;
    }
    // The subtract method accepts two natural numbers
// represented as character strings and returns their
// difference as a character string .
// The first number is not smaller than the second
    public static String subtract ( String num1 , String num2 )
    {
        while(num1.length() < num2.length()){
            num1 = "0" + num1;
        }
        while(num1.length() > num2.length()){
            num2 = "0" + num2;
        }
        int c = 0;
        String sub = "";
        for(int i = 1; i <= num1.length(); i++){
            int in1 = Character.getNumericValue(num1.charAt(num1.length()-i));
            int in2 = Character.getNumericValue(num2.charAt(num2.length()-i));
            in1 = in1 - c;
            c = 0;
            if (in1 < in2){
                sub = (in1 + 10 - in2) + sub;
                c = 1;
            }
            if ( in1 >= in2){
                sub = (in1-in2) + sub;
            }
        }
        return sub;
    }
    // The show method presents two natural numbers , an
// operator and the result string .
    public static void show ( String num1 , String num2 ,
                              String result , char operator )
    {
// set an appropriate length on numbers and result
        int len1 = num1 . length ();
        int len2 = num2 . length ();
        int len = result . length ();
        int maxLen = Math .max ( Math .max (len1 , len2 ), len );
        num1 = setLen (num1 , maxLen - len1 );
        num2 = setLen (num2 , maxLen - len2 );
        result = setLen ( result , maxLen - len );
// show the expression
        out . println (" " + num1 );
        out . println ("" + operator + " " + num2 );
        for (int i = 0; i < maxLen + 2; i++)
            out . print ("-");
        out . println ();
        out . println (" " + result + "\n");
    }
    // The setLen method prepends the supplied number of
// spaces ato the beginning of a string
    public static String setLen ( String s, int nofSpaces )
    {
        StringBuilder sb = new StringBuilder (s);
        for (int i = 0; i < nofSpaces ; i++)
            sb. insert (0, " ");
        return sb. toString ();
    }
}
