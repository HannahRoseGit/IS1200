public class DetermineTheShortestPath {
    public static void main (String[] args){
        double [] a = { 2 , 5 , 3 };
        double [][] b = { {5,4,7,8} , {9,7,3,5} , {4,8,6,8} };
        double [] c = { 3 , 5 , 6 , 4 };

        int[] shortPath = TheShortestPath.intermediateStations(a,b,c);
        System.out.println("The shortest path is going through:");
        System.out.println("U" + (shortPath[0]+1) + " and V" + (shortPath[1]+1));

        System.out.println("The shortest path has the length of:");
        System.out.println(TheShortestPath.length(a,b,c));
    }
}
