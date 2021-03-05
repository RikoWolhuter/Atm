/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prld_assignment_1;

import java.util.Scanner;

/**
 *
 * @author Riko Wolhuter
 */
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ All of these methods in their own class
public class Atm_Data {//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ class for ATM data
    public static void ViewMyBalance(double Balance)
    {
        System.out.println("Your bank balance is: R"+Balance);
    }
    public static double WithdrawCash(double Balance)
    {
        Scanner withDraw = new Scanner(System.in);
        System.out.print("How much money would you like to withdraw? R");
        double Withdraw = withDraw.nextDouble();
        double Balance1 = Balance - Withdraw;
        while(Balance1<0)
        {
           System.out.print("Insufficient funds try again.\nHow much money would you like to withdraw? R");
           Withdraw = withDraw.nextDouble();
           Balance1 = Balance - Withdraw;
        }
        System.out.println("Money withdrew: R"+Withdraw+"\nBank Balance is: R"+Balance1);
        return Balance = Balance - Withdraw;//Fix
    }
    public static double DepositFunds(double Balance)
    {
        Scanner Deposit = new Scanner(System.in);
        System.out.print("How much money would you like to Deposit? R");
        double deposit = Deposit.nextDouble();
        double Balance2 = Balance + deposit;
        System.out.println("Money deposited: R"+deposit+"\nBank Balance is: R"+Balance2);
        return Balance = Balance + deposit;//Fix
    }
    
}
