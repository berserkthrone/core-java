package OOPsClassAndInheritance.Challenge3;

public class main {
    public static void main(String[] args) {


        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee jack = new Employee("Jack", "20/02/2005",
                "15/02/2026");
        System.out.println(jack);
        System.out.println("Age = "+ jack.getAge());
        System.out.println("Pay = " + jack.collectPay());
    }

}
