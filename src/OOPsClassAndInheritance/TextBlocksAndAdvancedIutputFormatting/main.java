package OOPsClassAndInheritance.TextBlocksAndAdvancedIutputFormatting;

public class main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted list: \n" +
                "\t\u2022 First point \n"+
                "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First point
                            \u2022 Sub point""";
        System.out.println(textBlock);

        int age = 21;
        System.out.printf("Your age is %d \n", age);

        int yearOfBirth = 2026 - age;
        System.out.printf("Age = %d, Birth year = %d \n",age, yearOfBirth);

        for(int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
