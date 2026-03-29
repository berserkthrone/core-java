package ArrayLists.MinimumElementChallenge;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = readInteger(scanner);
        int[] numbers = readElements(scanner, count);
        int min = findMin(numbers);

        System.out.println("Minimum number is " + min);
    }
        private static int readInteger(Scanner scanner) {
        int count;

        while(true){
            System.out.println("enter count: ");

            if(scanner.hasNextInt()){
                count = scanner.nextInt();

                if(count > 0){
                    return count;
                }else{
                    System.out.println("Count must be positive");
                }
            }else{
                System.out.println("Invalid Input. Enter a valid Integer.");
                        scanner.next();
            }
        }
        }

        private static int[] readElements(Scanner scanner,  int count) {

            int[] array = new int[count];
            int i =0;
            while(i < count){
                System.out.println("enter element "+ (i+1) + ":");

                if(scanner.hasNextInt()){
                    array[i] = scanner.nextInt();
                    i++;
                }else{
                    System.out.println("Invalid Input. Enter a valid Integer.");
                    scanner.next();
                }
            }
            return array;
        }

        private static int findMin(int[] array) {

            int min = Integer.MAX_VALUE;                 // 1
            for (int i = 0; i < array.length; i++) {     // 2
                if (array[i] < min) {                    // 3
                    min = array[i];                      // 4
                }
            }
            return min;
        }
    }
