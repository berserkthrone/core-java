package basics;

public class ConditionalLogic {

    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or Both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("done");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar.equals("Volkswagen") ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        {
            String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

            System.out.println(s);
        }

        double variable1 = 20.00;
        double variable2 = 80.00;
        double total = (variable1 + variable2) * 100.00;
        System.out.println(total);
        double theRemainder = total % 40.00;
        System.out.println("The remainder = " + theRemainder);
        boolean isNoRemainder = theRemainder == 0.00 ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
