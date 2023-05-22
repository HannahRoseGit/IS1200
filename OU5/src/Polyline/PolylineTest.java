package Polyline;
import Point.*;

public class PolylineTest {
    public static void main (String []args){
        Point [] V = new Point[3];
        V[0] = new Point("A" , 0 ,1);
        V[1] = new Point("B",0,2);
        V[2] = new Point("C", 0,3);
        Polyline pl = new Polyline(V);
        pl.setColour("Blue");
        System.out.println(pl.length());
        System.out.println(pl.getColour());
        System.out.println(pl.toString());
        Point ver = new Point("D", 0 , 4);
        pl.addBefore(ver , "B");
        System.out.println(pl.toString());
        pl.remove("B");
        System.out.println(pl.toString());
        Polyline.PolylineIterator polyIteration = pl.new PolylineIterator();
        while (polyIteration.hasVertex()) {
            System.out.println(polyIteration.vertex());
            polyIteration.advance();
        }
    }
}
