package readingInputWithScanner;


import java.util.Scanner;

public class challengeUsingReadingInput1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int  counter = 0;
        int sum = 0;

        while(counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            counter++;
        }
    }

}
