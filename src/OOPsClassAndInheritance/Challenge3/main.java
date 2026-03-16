package OOPsClassAndInheritance.Challenge3;

public class main {
    public static void main(String[] args) {


        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee jack = new SalariedEmployee("Jack", "20/02/2005",
                "15/02/2026",350000);
        System.out.println(jack);
        System.out.println("Jack's Paycheck = $" + jack.collectPay());

        jack.retire();
        System.out.println("Jack's Pension check = $" + jack.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "11/11/2005",
                "11/11/2026",250000);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday pay = $" + mary.getDoublePay());
    }

}
