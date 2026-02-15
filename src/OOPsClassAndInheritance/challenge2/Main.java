package OOPsClassAndInheritance.challenge2;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("tim",1000,
                "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
    }
}
