package ArrayLists.DescendingChallenge;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        int[] sorted = sortIntegers(numbers);

        printArray(sorted);
    }

    public static int[] getIntegers(int size){
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        int i = 0;

        while(i < size){
            System.out.print("Enter an integer: " + (i + 1) + ": ");

            if(input.hasNextInt()){
                array[i] = input.nextInt();
                i++;
            }else{
                System.out.println("Invalid input");
                input.next();
            }
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = array.clone();

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for(int i = 0;i < sortedArray.length - 1;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array){
        for(int i = 0;i < array.length;i++){
            System.out.print(" Element " + i + " contents " + array[i]);
        }
    }
}
