package OOPsClassAndInheritance.POJOs;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
           Student s = new Student("S92300" + i,
                   switch(i){
               case 1 -> "marry";
               case 2 -> "carol";
               case 3 -> "tim";
               case 4 -> "harry";
               case 5 -> "lisa";
               default -> "Anonymous";
                   },
                   "05/11/1985",
                   "Java Masterclass");
           System.out.println(s);
        }
    }
}
