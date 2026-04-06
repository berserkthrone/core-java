package Array.AutoBoxing.Challenge;

import java.util.ArrayList;
import java.util.List;

// Customer should NOT expose internal list directly
record Customer(String name, List<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<>());
        if (initialDeposit <= 0) {
            throw new IllegalArgumentException("Initial deposit must be > 0");
        }
        transactions.add(initialDeposit);
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public double getBalance() {
        double sum = 0;
        for (double t : transactions) {
            sum += t;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase");

        // Add customers
        bank.addNewCustomer("Jane A", 500.0);
        bank.addNewCustomer("Bob S", 1000.0);
        bank.addNewCustomer("Alice M", 1500.0);

        // Add transactions
        bank.addTransaction("Jane A", -50.25);
        bank.addTransaction("Jane A", 200.00);
        bank.addTransaction("Bob S", -100.00);
        bank.addTransaction("Bob S", -250.75);
        bank.addTransaction("Alice M", 300.50);
        bank.addTransaction("Alice M", -120.00);

        // Print statements
        bank.printStatement("Jane A");
        bank.printStatement("Bob S");
        bank.printStatement("Alice M");

        // Show full bank
        System.out.println(bank);
    }
}

class Bank {
    private final String name;
    private final List<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) != null) {
            System.out.println("Customer already exists: " + customerName);
            return;
        }

        try {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("Added: " + customer.name());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to add customer: " + e.getMessage());
        }
    }

    public void addTransaction(String name, double amount) {
        Customer customer = getCustomer(name);

        if (customer == null) {
            System.out.println("Customer not found: " + name);
            return;
        }

        customer.addTransaction(amount);
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);

        if (customer == null) {
            System.out.println("Customer not found: " + customerName);
            return;
        }

        System.out.println("-".repeat(40));
        System.out.println("Customer: " + customer.name());

        for (double t : customer.transactions()) {
            System.out.printf("%10.2f (%s)%n", t, t < 0 ? "debit" : "credit");
        }

        System.out.printf("Balance: %.2f%n", customer.getBalance());
    }

    @Override
    public String toString() {
        return "Bank{name='%s', totalCustomers=%d}".formatted(name, customers.size());
    }
}
