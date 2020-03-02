package savingsaccount;

public class Account 
{
    private double balance = 0.0;  //balance of account
    private double interestRate;   //interest rate for growth
    
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate / 100.0;
    } //end setInterestRate
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    } //end setBalance
    
    public double getBalance()
    {
        return this.balance;
    } //end getBalance
    
    public void growAccount(int cycles)
    {
        for (int i = 0; i < cycles; i++)
        {
            this.balance += (this.interestRate * this.balance);
        } // end for
    } //end grow
    
} //end class growAccount
