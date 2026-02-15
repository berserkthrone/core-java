package OOPsClassAndInheritance.Challenge1;

public class Account {


        private String accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private String phone;

        public Account() {
            this("56789",2.50,"Default name",
                    "default address","default phone");
            System.out.println("Empty constructor called");
        }
        public Account (String accountNumber, double balance, String customerName, String email,
                        String phone){
            System.out.println("Account constructor with parameters called");
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phone = phone;
        }

    public Account(String customerName,String email, String phone) {
        this("99999",105.55,customerName,email,phone);
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
            }else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal of $" + withdrawalAmount +
                        " processed, Remaining balance = $" + balance);
            }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
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
