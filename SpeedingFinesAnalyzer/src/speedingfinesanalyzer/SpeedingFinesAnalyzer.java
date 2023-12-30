package speedingfinesanalyzer;

/*------------------------------------------------------start------------------------------------------------------*/
//Java program to display the three highest monthly speeding fines recorded for four different cities
public class SpeedingFinesAnalyzer {

    /*------------------------------------------main method start------------------------------------------*/
    public static void main(String[] args) {

        //Array of four different cities
        String[] cities = {"JHB" ,"DBN", "CTN", "PE"};
       
        //Array of monthly speeding fines
        int[][] speedingFines = { {128,135,139}, 
                                  {155,129,175}, 
                                  {129,130,185}, 
                                  {195,155,221} };
      
        for(int i = 0; i < 68; i++)
           System.out.print("*");
        System.out.println("\nSPEEDING FINES REPORT");
        for(int i = 0; i < 68; i++)
           System.out.print("*");
        System.out.printf("\n%-30s%-17s%-17s%-17s\n", " ", "JAN", "FEB", "MAR");
        for(int i = 0; i < speedingFines.length; i++)
        {
            System.out.printf("%-18s", cities[i]);
            for(int j = 0; j < speedingFines[i].length; j++)
            {
                System.out.printf("%15dkm", speedingFines[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < 68; i++)
           System.out.print("*");
        System.out.println("\nSPEEDING FINES STATISTICS");
        for(int i = 0; i < 68; i++)
           System.out.print("*");
        
        //Call methods
        System.out.println("\nMaximum speed captured: " + maxSpeedingFine(speedingFines) + "km");
        System.out.println("Minimum speed captured: " + minSpeedingFine(speedingFines) + "km");
        for(int i = 0; i < 68; i++)
           System.out.print("*");
    }
    /*-------------------------------------------main method end-------------------------------------------*/ 
    
    //Method to return the highest speeding fine
    public static int maxSpeedingFine(int[][] speedingFines)
    {
        int max = speedingFines[0][0];
        for(int[] speedingFine : speedingFines) 
        {
            for(int j = 0; j < speedingFine.length; j++) 
            {
                if(speedingFine[j] > max) 
                {
                    max = speedingFine[j];
                }
            }
        }
        return max;
    }
    
    //Method to return the lowest speeding fine
    public static int minSpeedingFine(int[][] speedingFines)
    {
        int min = speedingFines[0][0];
        for(int[] speedingFine : speedingFines) 
        {
            for(int j = 0; j < speedingFine.length; j++) 
            {
                if(speedingFine[j] < min) 
                {
                    min = speedingFine[j];
                }
            }
        }
        return min;
    }
}
/*-------------------------------------------------------end-------------------------------------------------------*/
