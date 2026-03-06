package OOPsClassAndInheritance.Challenge1;

public class Account {


        private String accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private String phone;

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
