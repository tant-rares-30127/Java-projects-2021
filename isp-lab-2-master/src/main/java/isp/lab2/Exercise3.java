package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        boolean sem=true;
        for (int i=2; i<=number/2;i++){
            if (number%i==0) sem=false;
        }
        return sem;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int s=0;
        while (number!=0){
            s=s+number%10;
            number=number/10;
        }
        return s;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int v[]=new int[b];
        int n=-1;
        for (int i=a; i<=b; i++){
            if (isPrimeNumber(i)){
                n++;
                v[n]=i;
            }
        }
        return v;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double m=1;
        double n=0;
        for (int i=0; i<primeNumbers.length; i++){
            if (primeNumbers[i]!=0){
                m=m*primeNumbers[i];
                n++;
            }
        }
        return Math.pow(m,1/n);
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int n=0;
        for (int i=0; i<primeNumbers.length; i++){
            if(primeNumbers[i]!=0){
            if(calculateSumOfDigits(primeNumbers[i])%2==0) n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        int a=scan.nextInt();
        System.out.print("b="); 
        int b=scan.nextInt();
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
