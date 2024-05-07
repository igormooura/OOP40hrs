package aula05;

public class Conta {
    public int accountNumber;
    protected String accountType; // CP = conta poupança ou CC = conta corrente
    private String holder;  //titular
    private double balance;
    private boolean status;

    // Methods

    public void General(){
        System.out.println("--------------------------------------------");
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Holder: " + this.getHolder());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + (this.status ? "Opened" : "Closed"));
    }

    public void openAccount(String type){
        this.setAccountType(type);
        this.setStatus(true);

        if(type.equalsIgnoreCase("CC")){
            this.setBalance(50);
        }
        if(type.equalsIgnoreCase("CP")){
            this.setBalance(150);
        }
    }

    public void closeAccount() {
        if (this.getBalance() == 0) {
            this.setStatus(false);
            System.out.println("--------------------------------------------");
            System.out.println("Account closed successfully!");
        } else {
            System.out.println("--------------------------------------------");
            System.out.println("The account cannot be closed because it has R$ " + this.getBalance());
        }
    }

    public void deposit(double value){
        if(this.getStatus()){
            this.setBalance(this.getBalance() + value);
        }
        if(!this.getStatus()){
            System.out.println("--------------------------------------------");
            System.out.println("Account's closed!");
        }
    }

    public void withdraw(double value) {
        if(this.getStatus()){
            if(this.getBalance() >= value){
                this.setBalance(this.getBalance() - value);
            }
            if(this.getBalance() <= 0){
                System.out.println("--------------------------------------------");
                System.out.println("Account has no funds or is in debit!");
            }
        }
        if(!this.getStatus()){
            System.out.println("--------------------------------------------");
            System.out.println("Account's closed or does not exist!");
        }
    }

    public void payMonthlyFee(){
        double monthlyFee = 0;
        if(this.getAccountType().equalsIgnoreCase("CC")){
            monthlyFee = 12;
        }
        if(this.getAccountType().equalsIgnoreCase("CP")){
            monthlyFee = 20;
        }

        if(this.getStatus()){
            if(this.getBalance() > monthlyFee){
                this.setBalance(this.getBalance() - monthlyFee);
            }
            else{
                System.out.println("--------------------------------------------");
                System.out.println("Insufficient balance for the fee.");
            }
        }
        if(!this.getStatus()){
            System.out.println("--------------------------------------------");
            System.out.println("Account closed or does not exist.");
        }
    }

    // Special methods

    public void Account(){
        this.setBalance(0);
        this.setStatus(false);
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getStatus() {
        return status;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}