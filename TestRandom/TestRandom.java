package TestRandom;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class TestRandom {
    public static int getRandomNumber(int min, int max) {
        if (min >= max){
            throw new IllegalArgumentException("die maximale Anzahl muss groesser als die minimale Anzahl");
        }
        
        Random number = new Random();
		return number.nextInt((max - min) + 1) + min;
    }

    public static int getMax(int[] numbers){
        int max = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int getMin(int[] numbers){
        int min = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double getAvg(int[] arr){
        double avg = 0;
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            sum += arr[i];
            avg = (double) sum / arr.length;
        }
        return avg;
    }

    public static int getCommon(int[] arr){
        int count = 0;
        int mostRepeated = 0;
        int mode = 0;
        for(int i = 0; i < arr.length - mostRepeated; i++) {
            for(int a = i; a < arr.length; a++){
                if(arr[i] == arr[a]) {
                    count++;
                }
            }
            if(count >  mostRepeated) {
                mostRepeated = count;
                mode = arr[i];
            }
            count = 0;
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Geben sie die Laenge des Arrays ein !!!");
        System.out.print("==> ");
        int length = scan.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(20, 50);
            System.out.println(arr[i]);
        }
        
        System.out.println("Zufallzahlen: " + Arrays.toString(arr));
        System.out.println("Die Summe: " + getSum(arr));
        System.out.println("Der Durchschnitt: " + getAvg(arr));
        System.out.println("Die Groesste Zahl: " + getMax(arr));
        System.out.println("Die Kleinste Zahl: " + getMin(arr));
        System.out.println("Die haeufigste Zahl: " + getCommon(arr));
    }
}