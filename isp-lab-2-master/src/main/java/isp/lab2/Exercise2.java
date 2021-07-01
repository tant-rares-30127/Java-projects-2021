package isp.lab2;

import java.util.*;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        return x;
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        int [ ]echipe = {49, 46, 43, 42, 40, 39};
        boolean sem=false;
        for (int i=0; i<echipe.length; i++)
        {
            if (echipe[i]==numberOfPoints) sem=true; 
        }
        if (sem==true) return "Exista o echipa cu acest punctaj";
        else return "Nu exista o echipa cu acest punctaj";
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
