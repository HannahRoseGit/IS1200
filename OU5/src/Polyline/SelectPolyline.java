package Polyline;
import java.util.*;
import java.io.*;
import java.lang.*;
import Point.*;

public class SelectPolyline {
    public static final Random rand = new Random();
    public static final int NOF_POLYLINES = 10;

    public static void main(String[] args) {
// Create a random number of polylines
        Polyline[] polylines = new Polyline[NOF_POLYLINES];
        for (int i = 0; i < NOF_POLYLINES; i++)
            polylines[i] = randomPolyline();
// Show the polylines
        for (int i = 0; i < NOF_POLYLINES; i++) {
            System.out.println("polyline " + i + " is:");
            System.out.println(polylines[i]);
        }
// Determine the shortest yellow polyline
        int found = 0;
        Polyline shortestYel = polylines[0];
        for (int i = 0; i < NOF_POLYLINES; i++){
            if (polylines[i].getColour().equals("Yellow")){
                if (shortestYel.length() < polylines[i].length()){
                    found = 1;
                    shortestYel = polylines[i];
                }
            }
        }
// Show the selected polyline
        if (found==1){
            System.out.println("The shortest yellow polyline is " + shortestYel.toString());
        }
    }

    // The randomPoint method returns a new Point with a name
// randomly chosen from the single letters A--Z. Coordinates
// are random.
    public static Point randomPoint() {
        String n = "" + (char) (65 + rand.nextInt(26));
        int x = rand.nextInt(11);
        int y = rand.nextInt(11);
        return new Point(n, x, y);
    }

    // The method randomPolyline returns a random polyline ,
// with a colour either blue , red , or yellow. The names
// of the vertices are single letters from the set A--Z.
// Two vertices can not have the same name.
    public static Polyline randomPolyline() {
// Create an empty polyline and add vertices
        Polyline polyline = new Polyline();
        int nofVertices = 2 + rand.nextInt(7);
        int nofSelectedVertices = 0;
        boolean[] selectedNames = new boolean[26];
// Two vertices can not have the same name
        Point chosenPoint = null;
        char chosenChar = 0;
        int intMode;
        while (nofSelectedVertices < nofVertices) {
            chosenPoint = randomPoint();
            chosenChar = chosenPoint.a.charAt(0);
            intMode = (int) (chosenChar) - 65;
            if (!selectedNames[intMode]) {
                selectedNames[intMode] = true;
                polyline.addLast(chosenPoint);
                nofSelectedVertices++;
            }
            // Assign a colour
            polyline.setColour(randomColour());

        }
        return polyline;
    }
    public static String randomColour() {
        String colour;
        int colourCode = rand.nextInt(3);
        if (colourCode == 0) {
            colour = "Blue";
        } else if (colourCode == 1) {
            colour = "Red";
        } else {
            colour = "Yellow";
        }
        return colour;
    }

}

