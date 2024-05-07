package aula05;

public class Aula05 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setAccountNumber(123456);
        conta1.setHolder("João");
        conta1.openAccount("CC");

        conta1.General();

        conta1.deposit(100);
        conta1.General();

        conta1.withdraw(50);
        conta1.General();

        conta1.payMonthlyFee();
        conta1.General();


        conta1.withdraw(88);
        conta1.closeAccount();

        conta1.General();
    }
}
