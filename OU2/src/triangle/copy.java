package triangle;
 import java.lang.Math;
   /* public class Main (String[] args) {

        //calculating the sides
        public static double sideMesurement (int a, int b, int c, int d){
            double side = Math.sqrt( (a-c)^2 + (b-d)^2 );
            return side;
        }

        //calculating the circumference
        public static double circumference (double s1, double s2, double s3 ){
            double cir = s1 + s2 + s3;
            return cir;
        }
        //calculating an angle
        public static double angle ( double side1, double side2, double base){
            double angle = java.lang.Math.acos((side1*side1 + side2*side2 - base*base)/ (2*side1*side2));
            return angle;
        }

        //calculating the area
        public static double area ( double side1, double side2, double angle){
            double area =  (1/2)*side1*side2*(java.lang.Math.sin(angle));
            return area;
        }

        //calculating an altitude
        public static double altitude ( double base, double area){
            double altitude = 2*(area/base);
            return altitude;
        }

        //calculating a median
        public static double median (int base11, int base12, int base21, int base22, int point1, int point2){
            int mid1 = (base11 + base21) / 2;
            int mid2 = (base12 + base22) / 2;
            double median = sideMesurement(mid1, mid2, point1, point2);
            return median;
        }

        //calculating a bisector
        public  static  double  bisector(double b, double c, double  alpha){
            double p = 2 * b * c * Math.cos (alpha / 2);
            double  bis = p / (b + c);
            return  bis;
        }


        public static void main(String[] args) {

            int x1 = -1;
            int y1 = 3;
            int x2 = 11;
            int y2 = 4;
            int x3 = 10;
            int y3 = 7;

            double side1 = sideMesurement(x1,y1,x2,y2);
            double side2 = sideMesurement(x2,y2,x3,y3);
            double side3 = sideMesurement(x3,y3,x1,y1);
            double angle = angle(side1, side2, side3);
            double area = area(side1,side2,angle);
            double circumference = circumference(side1, side2, side3);

            double radius = area / (circumference/2);

            System.out.println(radius);
        }
    }*/


