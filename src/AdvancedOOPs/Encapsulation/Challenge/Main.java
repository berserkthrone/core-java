package AdvancedOOPs.Encapsulation.Challenge;

public class Main {

    public static void main(String[] args) {

    Printer printer = new Printer(50, true);
    System.out.println("initial page count = " + printer.getPagesPrinted());

    int pagesPrinted = printer.printPages(10);
    System.out.printf("current Job pages: %d, Printer Total: %d %n",
             pagesPrinted, printer.getPagesPrinted());
    }
}
