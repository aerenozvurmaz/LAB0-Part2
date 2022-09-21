/**
 * Github 2
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class GithubGroup{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Put a number: ");
        int number = in.nextInt();

        int[] array = new int[number];
        int[] differenceArray = new int[number];

        for(int i = 0; i < number; i++){
            array[i] = rand.nextInt(0,100);
        }
        System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit");
        int choice = in.nextInt();

        do {
            int maxValue = 0;
        int minValue = 100;
        int average = 0;
        int sumOfOddIndexes = 0;
        int sumOfEvenIndexes = 0;
            if(choice == 1){

                for(int i = 0; i < array.length; i++){
                    if(array[i] > maxValue){
                        maxValue = array[i];
                    }
                }

                for(int i = 0; i < array.length; i++){
                    if(array[i] < minValue){
                        minValue = array[i];
                    }
                }
                System.out.println("Max value is: " + maxValue + "\n Min value is: " + minValue);

                System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit \n");
                 choice = in.nextInt();
            }
            
            if(choice == 2){
                for(int i = 0; i < array.length; i++){
                    average += array[i];
                }
                average = average / array.length;
                System.out.println("Average is: " + average);

                for(int i = 0; i < array.length; i++){
                    differenceArray[i] = array[i] - average;
                }
                System.out.println("Differences from the average respectively are: " + Arrays.toString(differenceArray));

                System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit \n");
                choice = in.nextInt();
            }

            if(choice == 3){
                for(int i = 0; i < array.length; i++){
                    if(i % 2 == 0){
                        sumOfEvenIndexes += array[i];
                    }else{
                        sumOfOddIndexes += array[i];
                    }
                }
                System.out.println("Sum of odd indexes are: " + sumOfOddIndexes + "\n Sum of even indexes are: " + sumOfEvenIndexes);

                System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit \n ");
                choice = in.nextInt();
            }
        } while (choice != 4);
}

}