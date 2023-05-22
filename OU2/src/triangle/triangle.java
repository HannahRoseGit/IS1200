package triangle;
import java.util.Scanner;
import static java.lang.Math.*;

public class triangle {
        // Methods for calculating

        //calculating the circumference
        // inputs are three sides of the triangle as doubles
        // the method gives you the circumference as a double
        public static double circumference( double s1, double s2, double s3 ){
              double cir = s1 + s2 + s3;
              return cir;
        }

        //calculating the area
        // inputs are two sides of the triangle and the angle between them as doubles
        // the method gives you the area as a double
        public static double area ( double s1, double s2, double angle){
              double area = ( (s1 * s2 * (Math.sin(angle))) / 2);
              return area;
        }

        //calculating an altitude
        // inputs are base of the triangle and its area as doubles
        // the method gives you the altitude as a double
        public static double altitude ( double base, double area){
            double altitude = 2 * (area / base);
            return altitude;
        }

        //calculating an angle
        // inputs are two sides of the triangle and the base as doubles
        // the method gives you the angle between as a double
        public static double angle ( double side1, double side2, double base){
            double angle = java.lang.Math.acos((Math.pow(side1,2)+ Math.pow(side2,2) - Math.pow(base,2))/ (2 * side1 * side2));
            return angle;
        }

        //calculating a median
        // inputs are two sides of the triangle and the base as doubles
        // the method gives you the median between as a double
        public static double median ( double side1, double side2, double base ){
            double med = java.lang.Math.sqrt((2 * (side1 * side1) + 2 * (side2 * side2) - (base * base)) / 4);
            return med;
        }

        //calculating a bisector
        // inputs are two sides of the triangle and the angle between them as doubles
        // the method gives you the bisector between as a double
        public static double bisector ( double b, double c, double alpha){
            double p = 2 * b * c * Math.cos(alpha / 2);
            double bis = p / (b + c);
            return bis;
        }

        //calculating radius of innercircle
        // inputs are three sides of the triangle as doubles
        // the method gives you the incircle radius as a double
        public static double incircleRadius (double s1, double s2, double s3){
            double angle = angle(s1, s2, s3);
            double area = area(s1, s2, angle);
            double circumference = circumference(s1, s2, s3);

            double radius1 = (2 * area) / circumference;
            return radius1;
        }

        //calculating radius of circumcircle
        // inputs are three sides of the triangle as doubles
        // the method gives you the circumcircle radius as a double
        public static double circumcircleRadius (double s1, double s2, double s3){
            double angle = angle(s1, s2, s3);
            double area = area(s1, s2, angle);

            double radius2 = (s1 * s2 * s3) / (4 * area);
            return radius2;
        }











































   /* public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        // communicating with the user
        System.out.println("Dear user, please enter what you want to be calculated:");
        System.out.println(" 1.Circumference \n 2.Area\n 3.Altitude\n 4.An angle\n 5.A median \n 6.A bisector");
        System.out.println("-----------------");
        int t = input.nextInt();
        System.out.println("-----------------");

        // switch for user choices
        switch (t){

            case 1:
                System.out.println("Enter the sides:");
                System.out.println("Side 1 :");
                double s1 = input.nextDouble();
                System.out.println("Side 2 :");
                double s2 = input.nextDouble();
                System.out.println("Side 3 :");
                double s3 = input.nextDouble();

                System.out.println("The circumference is "+ circumference(s1,s2,s3));
                break;

            case 2:
                System.out.println("Enter the sides and the base:");
                System.out.println("Side 1 :");
                s1 = input.nextDouble();
                System.out.println("Side 2 :");
                s2 = input.nextDouble();
                System.out.println("Base :");
                double b = input.nextDouble();

                double angle = angle(s1,s2,b);

                System.out.println("The area is " + area(s1,s2,angle));
                break;

            case 3:

                System.out.println("Enter the sides and the base:");
                System.out.println("Side 1 :");
                s1 = input.nextDouble();
                System.out.println("Side 2 :");
                s2 = input.nextDouble();
                System.out.println("Base :");
                b = input.nextDouble();

                angle = angle(s1,s2,b);
                double area = area(s1,s2,angle);

                System.out.println("The altitude is " + altitude(b,area));
                break;

            case 4:

                System.out.println("Enter the sides and the base:");
                System.out.println("Side 1 :");
                s1 = input.nextDouble();
                System.out.println("Side 2 :");
                s2 = input.nextDouble();
                System.out.println("Base :");
                b = input.nextDouble();

                System.out.println("The angle you are looking for is " + angle(s1,s2,b) + " (radians)");
                break;

            case 5:
                System.out.println("Enter the sides and the base:");
                System.out.println("Side 1 :");
                s1 = input.nextDouble();
                System.out.println("Side 2 :");
                s2 = input.nextDouble();
                System.out.println("Base :");
                b = input.nextDouble();

                System.out.println("The median is " + median(s1,s2,b));
                break;

            case 6:
                System.out.println("Enter the sides and the angle:");
                System.out.println("Side 1 :");
                s1 = input.nextDouble();
                System.out.println("Side 2 :");
                s2 = input.nextDouble();
                System.out.println("Angle (in radian) :");
                double a = input.nextDouble();

                System.out.println("The bisector is " + median(s1,s2,a));
                break;

        }*/















        /*
        System.out.println("-----------------");
        System.out.println("Do you want to calculate for its incircle? \n 1.Yes \n 2.No");
        System.out.println("-----------------");
        int s = input.nextInt();
        System.out.println("-----------------");

        System.out.println("Enter the sides:");
        System.out.println("Side 1 :");
        double s1 = input.nextDouble();
        System.out.println("Side 2 :");
        double s2 = input.nextDouble();
        System.out.println("Side 3 :");
        double s3 = input.nextDouble();

        double angle = angle(s1,s2,s3);
        double area = area(s1,s2,angle);
        double circumference = circumference(s1,s2,s3);

        switch (s){
            case 1:

                double radius1 = (2*area)/circumference;
                double incircleCircumference = 2 * radius1 * 3.14;

                System.out.println("The radius of incircle is "+ radius1 + " and the circumference is " + incircleCircumference);

                double radius2 = (s1*s2*s3)/(4*area);
                double circumcircleCircumference = 2 * radius2 * 3.14;

                System.out.println("The radius of circumcircle is "+ radius2 + " and the circumference is " + circumcircleCircumference);
                break;
        }*/



    }


