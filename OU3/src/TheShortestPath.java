public class TheShortestPath {
    // The method intermediateStations returns a vector of the
    // intermediate stations that are on the shortest path.
    // The ordinal number of the first station is located in
    // index 1 of the vector , and the second station on index 2.

    public static int [] intermediateStations (double [] a,
                                               double [][] b,
                                               double [] c) {
        int min = (int) (a[0] + b[0][0] + c[0]);
        int [] path = {0,0,0} ;
        double sum = 9999;
        for ( int i = 0 ; i < a.length ; i++ ){
            for ( int j = 0 ; j < c.length ; j++ ){
                sum =  a[i] + b[i][j] + c[j];
                if (sum < min){
                    min = sum;
                    path = new int[]{i, j, j};
                }
            }
        }
        return path;
    }

    // The method length returns the length of the shortest path.
    public static double length (double [] a,
                                 double [][] b,
                                 double [] c) {
        int min = (int) (a[0] + b[0][0] + c[0]);
        int [] path = {0,0,0} ;
        int sum = 9999;
        for ( int i = 0 ; i <= 2 ; i++ ){
            for ( int j = 0 ; j <=3 ; j++ ){
                sum = (int) ( a[i] + b[i][j] + c[j]);
                if ( sum <= min ){
                    min = sum;
                    path = new int[]{i, j, j};
                }
            }
        }
        return min ;
    }

}
