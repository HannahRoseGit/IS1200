package triangle;
import java.util.Scanner;
public class TriangleAndItsCircles {

    public static void main(String arg[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sides:");
        System.out.println("Side 1 :");
        double s1 = in.nextDouble();
        System.out.println("Side 2 :");
        double s2 = in.nextDouble();
        System.out.println("Side 3 :");
        double s3 = in.nextDouble();

        System.out.println("The radius of incircle: " + triangle.incircleRadius(s1,s2,s3));
        System.out.println("The radius of circumcircle: " + triangle.circumcircleRadius(s1,s2,s3));
        }
    }

