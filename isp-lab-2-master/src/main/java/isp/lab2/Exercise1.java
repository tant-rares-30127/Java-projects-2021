package isp.lab2;
import java.util.*;

public class Exercise1 {

    
     // This method should generate an random number between 2 and 10 then  
     // should ask user to enter that amount of numbers from keyboard and
     // store the numbers in an int array which should be returned
     // @return the array of numbers read from keyboard
     
    private static int[] getUserNumbers() {
        Random r = new Random();
         int n = r.nextInt(11); 
         while (n<2) 
         {
            n = r.nextInt(11); 
         }
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu atatea numere: " +n);
        int userNumbers[] = new int[n];
        for (int i=0;i<userNumbers.length;i++){
            userNumbers[i]=scan.nextInt();
        }
        return userNumbers;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double x=0;
        for (int i=0;i<userNumbers.length;i++){
            x=x+userNumbers[i];
        }
        System.out.println(x);
        double m=x/userNumbers.length;
        System.out.println(m);
        return m;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
