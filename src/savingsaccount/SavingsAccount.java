package savingsaccount;

/******************************************************************************
 * MultipleSavingsAccounts.java 
 * Programmer: @author jcboyd
 * Version: 2.0
 * Course: SDEV 2210
 *
 * This program calculates the value of a savings account as it grows
 *****************************************************************************/

import java.util.Scanner;

public class SavingsAccount {

    public static void main(String[] args) 
    {
        //Declarations
        Scanner stdIn = new Scanner(System.in);     
        Account savings1 = new Account();        //first account
        Account savings2 = new Account();        //second account
        Account savings3 = new Account();        //third account
        int cycles;                              //number of times to compound interest
        double interestRate;                     //user input interest rate
        double balance;                          //user input starting balance
        //Input - get the needed data
        System.out.println("Ch 6 Multiple Accounts by JC Boyd");
        for (int i = 1; i <= 3; i++) //get inputs for 3 accounts with index i
        {
            System.out.printf("\nNew Savings Account #%d\n", i);
            System.out.print("Enter the starting balance for this Savings Account: ");
            balance = stdIn.nextDouble();
            System.out.println("Interest rate: to enter 2.5%, type 2.5");
            System.out.print("Please enter the interest rate for this account: ");
            interestRate = stdIn.nextDouble();
            System.out.print("Enter the number of cycles to grow this Savings Account: ");
            cycles = stdIn.nextInt();
            if (i == 1) //set values for account 1
            {
                savings1.setInterestRate(interestRate);
                savings1.setBalance(balance);
                savings1.growAccount(cycles);               
            }
            else if (i == 2) //set values for account 2
            {
                savings2.setInterestRate(interestRate);
                savings2.setBalance(balance);
                savings2.growAccount(cycles); 
            }
            else //set values for account 3
            {
                savings3.setInterestRate(interestRate);
                savings3.setBalance(balance);
                savings3.growAccount(cycles); 
            } //end if  
        } //end for

        //Output
        System.out.printf("\nSavings Account 1: After growth, the account is worth $%-,10.2f\n",
                savings1.getBalance());
        System.out.printf("Savings Account 2: After growth, the account is worth $%-,10.2f\n",
                savings2.getBalance());
        System.out.printf("Savings Account 3: After growth, the account is worth $%-,10.2f\n\n",
                savings3.getBalance());

    } //end main

} //end class SavingsAccount
