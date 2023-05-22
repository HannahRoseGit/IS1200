package Point;
import java.lang.Math;
public class Point {
   public String a;
   public int x,y;
    public  Point(String a , int x , int y){
        this.a = a;
        this.x = x;
        this.y = y;
   }

    public Point(Point p1) {
        this.a = p1.a;
        this.x = p1.x;
        this.y = p1.y;
    }

    public String getName() {
        return a;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point p2) {
        double d = Math.hypot((this.x - p2.x) , (this.y - p2.y) );
        return d;
    }

    public void setX(int i) {
        this.x = i;
    }

    public void setY(int i) {
        this.y = i;
    }

}
