package OOPsClassAndInheritance.Challenge1;

public class Account {


        private String accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private String phone;

    public Account() {
        this("56789",2.50,"Default name",
                "Default address","Default phone");
        System.out.println("Empty Constructor is called");
        //this is constructor with no parameters also called no args-constructor.
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phone) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }//Constructor.

    public Account(String customerName, String email, String phone) {
        this("9999",100.55,customerName,email,phone);
//        this.customerName = customerName;
//        this.email = email;
//        this.phone = phone;
    }

    public void depositFunds(double depositAmount){
            balance += depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balace is $"
                    + this.balance);
        }

        public void withdrawFunds(double withdrawalAmount){
          if(balance - withdrawalAmount < 0){
              System.out.println("Insufficient Funds! You only have $" + balance +
                      " in you account.");
          }else{
              balance -= withdrawalAmount;
              System.out.println("Withdrawal of $" + withdrawalAmount +
                      " processed, Remaining balance = $" + this.balance);
          }
        }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
