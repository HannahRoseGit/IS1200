package Polyline;

import Point.Point;

public class Polyline1 {
    private Point[] vertices;
    private String colour = "black";
    private int width = 1;
    public Polyline1 ()
    {
        this.vertices = new Point [0];
    }
    public Polyline1 (Point [] vertices)
    {
        this.vertices = new Point[vertices.length ];
        for (int i = 0; i < vertices.length; i++)
            this.vertices[i] = vertices[i];
    }
    public String toString () {
        String result = "";
        for (int i = 0 ; i < vertices.length ; i++){
            result = result + this.vertices[i].getName()+ " " + this.vertices[i].getX() + " " + this.vertices[i].getY() + " , " ;
        }
        result = result + "The color is: " + this.getColour() + " - The width is: " + this.getWidth();
        return result;
    }

    public Point [] getVertices () {
        return this.vertices;
    }

    public String getColour () {
        return this.colour;
    }

    public int getWidth () {
        return this.width;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public void setWidth (int width) {
        this.width = width;
    }

    public double length () {
        double len = 0;
        for ( int i = 0 ; i < this.vertices.length ; i++){
            len = len + vertices[i].distance(vertices[i+1]);
        }
        return len;
    }
    public void addLast (Point vertex)
    {
        Point[] h = new Point[this.vertices.length + 1];
        int i = 0;
        for (i = 0; i < this.vertices.length; i++)
            h[i] = this.vertices[i];
        h[i] = vertex;
        this.vertices = h;
    }
    public void addBefore (Point vertex , String vertexName) {
        int f=0;
        Point [] h = new Point[this.vertices.length+1];
        for (int i = 0 ; i < vertices.length ; i++){
            h[i] = this.vertices[i];
            if(vertices[i].getName().equals(vertexName)){
                f = i;
                break;
            }
        }
        h[f] = vertex;
        for (int i = f+1 ; i < this.vertices.length ; i++){
            h[i] = this.vertices[i-1];
        }
        this.vertices = h;
    }

    public void remove (String vertexName) {
        Point [] h = new Point[this.vertices.length-1];
        int f = 0;
        for ( int i = 0 ; i < this.vertices.length ; i++ ){
            if (this.vertices[i].getName().equals(vertexName)){

            }
            else{
                h[f] = this.vertices[i];
                f++;
            }
        }
        this.vertices = h;
    }

}
