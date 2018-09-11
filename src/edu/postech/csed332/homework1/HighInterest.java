package edu.postech.csed332.homework1;

/**
 * The interest of HighInterest account is 1% per day. For example, one person puts 100
 * dollars in his HighInterest Account(At Day 1). After 10 days(Day 11), 
 * the balance of the account will be 100*(1.01)^10.
 * The balance of HighInterest account should always bigger or equal to 1000. 
 */
class HighInterest implements Account {

    // NOTE: Implemented

    int accountNumber;
    double balance;
    String owner;

    public HighInterest(int an, String n, double b) {

        this.accountNumber = an;

        /**
         * HACK: "The balance should always bigger or equal to 1000."
         * But in given main function of this homework, it does not handles any 
         * exception when it calls {@link Bank#createAccount (String, ACCTYPE, 
         * double)}. So I cannot throw "NotEnoughException" in this constructor.
         * Instead, this code will fix balance to 1000 if the initial value is
         * lower than 1000. WATTA STRANGE BANK!
         */
        if (b < 1000)
            this.balance = 1000;
        else
            this.balance = b;

        if (n == null)
            this.owner = "";
        else
            this.owner = n;

        System.out.println("Successfully created " + this.owner + "'s new high interest account (" + (int) this.accountNumber + ") with balance " + this.balance + ".");

    };

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) throws NotEnoughException {
        
        // NOTE: "The balance should always bigger or equal to 1000."
        if (amount > balance - 1000)
            throw new NotEnoughException();
        
        this.balance -= amount;

        System.out.println("Withdraw " + amount + " from " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

    @Override
    public void updateBalance(int elapsedDate) {

        this.balance *= Math.pow(1.01, elapsedDate);

        System.out.println("Balance multiplication of " + elapsedDate + " days (x1.01^" + elapsedDate + ") applied to " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

    @Override
    public void deposit(double amount) {

        this.balance += amount;

        System.out.println("Deposit " + amount + " to " + this.owner + "'s account (" + (int) this.accountNumber + "), now is " + this.balance + ".");

    }

}
