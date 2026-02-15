package OOPsClassAndInheritance.Challenge1;

public class BuildBankAccountChallenge {
    public static void main(String[] args) {

//        Account bobsAccount = new Account ("12345", 500.00,"Bob Brown","email.com",
//                "(087 127-4567");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setPhone("70688924642");
//        bobsAccount.setEmail("bobs@gmail.com");

        bobsAccount.withdrawFunds(100.00);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        Account timsAccount = new Account("Tim",
                "tim@email.com","12345678");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());
    }
}
