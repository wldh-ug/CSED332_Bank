package edu.postech.csed332.homework1;

/**
 * The interest of LowInterest account is 0.5% per day. For example, one person puts 100
 * dollars in his LowInterest Account(At Day 1). After 10 days(Day 11), 
 * the balance of the account will be 100*(1.005)^10.
 */
class LowInterest implements Account {
    
    // NOTE: Implemented

    double accountNumber;
    double balance;
    String owner;

    public LowInterest(int an, String n, double b) {

        this.accountNumber = (double) an;

        if (b < 0)
            this.balance = 0;
        else
            this.balance = b;

        if (n == null)
            this.owner = "";
        else
            this.owner = n;

        System.out.println("Successfully created " + this.owner + "'s new low interest account (" + (int) this.accountNumber + ") with balance " + this.balance + ".");

    };

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) throws NotEnoughException {
        
        if (amount > balance)
            throw new NotEnoughException();
        
        this.balance -= amount;

        System.out.println("Withdraw " + amount + " from " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

    @Override
    public void updateBalance(int elapsedDate) {

        this.balance *= Math.pow(1.005, elapsedDate);

        System.out.println("Balance multiplication of " + elapsedDate + " days (x1.005^" + elapsedDate + ") applied to " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

    @Override
    public void deposit(double amount) {

        this.balance += amount;

        System.out.println("Deposit " + amount + " to " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

}
