class BankAccount
{
    String account_holder_name;
    double Balance;
    void deposit(double amount)
    {
        Balance = Balance + amount;
        System.out.println("deposited:" + amount);
    }
    void withdraw(double amount)
    {
        if(amount<=Balance)
        {
            Balance = Balance-amount;

            System.out.println("withdraw:"+amount);
        }
        else
        {
            System.out.println("insufficient Balance");
        }
    }
    void checkBalance()
    {
        System.out.println("Account Holder_name");
        System.out.println("Balance:"+Balance);
    }
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();
        b.account_holder_name="paree";
        b.Balance=5000;
        b.deposit(2000);
        b.withdraw (1500);
        b.checkBalance();
    }
}
