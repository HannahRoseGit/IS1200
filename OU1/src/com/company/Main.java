package com.company;
import  java.util .* ;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        in.useLocale(Locale.US);
        System.out.print("number  of weeks: ");
        int nofWeeks = in.nextInt();
        System.out.print("number  of  measurements  per  week: ");
        int nofMeasurementsPerWeek = in.nextInt  ();
        double [][] t = new  double[nofWeeks + 1][ nofMeasurementsPerWeek + 1];
        for (int week = 1; week  <= nofWeeks; week ++){
            System.out.println ("temperatures  - week " + week + ":");
            for ( int reading = 1;  reading  <= nofMeasurementsPerWeek; reading ++)
                t[week][ reading] = in.nextDouble  ();
        }
        //t[nofWeeks][ nofMeasurementsPerWeek] = in.nextDouble  ();
        System.out.println ("the  temperatures:");
        for (int week = 1; week  <= nofWeeks; week ++){
            for (int reading = 1;  reading  <= nofMeasurementsPerWeek; reading ++)
                System.out.print (t[week][ reading] + " ");
            System.out.println  ();
        }
        System.out.println  ();
        double []     minT = new  double[nofWeeks + 1];
        double []     maxT = new  double[nofWeeks + 1];
        double []     sumT = new  double[nofWeeks + 1];
        double []     avgT = new  double[nofWeeks + 1];

        for(int s = 1; s <= nofWeeks;s++){
            minT[s] = t[s][1];
            for(int m=1; m<=nofMeasurementsPerWeek; m++){
                sumT [s] = sumT[s] +t[s][m];
                if(minT[s]  > t[s][m]){
                    minT[s] = t[s][m];
                }
                if(maxT[s]<t[s][m]){
                    maxT [s] =t[s][m];
                }
            }
            avgT[s] =sumT[s]/nofMeasurementsPerWeek;
        }

        // jhgghh
        for(int s = 1; s<=nofWeeks;s++){
            System.out.println("the minimum temperature for week "+s+" is " + minT[s]);
        }
        for(int s = 1; s<=nofWeeks;s++){
            System.out.println("the maximum temperature for week "+s+" is " + maxT[s]);
        }
        for(int s = 1; s<=nofWeeks;s++){
            System.out.println("the average temperature for week "+s+" is " + avgT[s]);
        }

        ??
        double     minTemp = minT [1];
        double     maxTemp = maxT [1];
        double     sumTemp = sumT [1];
        double     avgTemp = 0;
        for(int s = 1; s<= nofWeeks; s++){
            if(minTemp>minT[s]){
                minTemp=minT[s];
            }
            if(maxTemp[s] < maxT[s] ){
               maxTemp= maxT[s];
            }
            if(s!=1){
                sumTemp =sumTemp+ sumT[s];
            }
        }
        avgTemp = sumTemp/(nofMeasurementsPerWeek*nofWeeks);
        System.out.println("The total minimum temperature of the "+nofWeeks+" weeks is "+minTemp);
        System.out.println("The total maximum temperature of the "+nofWeeks+" weeks is "+ maxTemp);
        System.out.println("The total average temperature of the "+nofWeeks+" weeks is "+ avgTemp);
    }
}
