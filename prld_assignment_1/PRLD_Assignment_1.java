package prld_assignment_1;
import java.util.Scanner;

public class PRLD_Assignment_1 {

    public static void main(String[] args) {
Atm_Data AtmData = new Atm_Data();//$$$$$$$$$$$$$$$$$$$$$$$$$$ Add AtmData object to mainline logic pseducode
double Balance = 250;
Scanner keypad = new Scanner(System.in);
System.out.println("Welcome!");
System.out.print("Please enter your account number: ");
int accountNbr = keypad.nextInt();
System.out.print("Enter your PIN: ");
int Pin = keypad.nextInt();

while(Pin != 19871 && accountNbr != 20257)
{
    System.out.println("Incorrect Account number and Pin, Try again.");
    System.out.print("Please enter your account number: ");
accountNbr = keypad.nextInt();
System.out.print("Enter your PIN: ");
Pin = keypad.nextInt();
}

while(Pin == 19871 && accountNbr == 20257)//For pseudocode make sure im using correct argument orientataion and comparison operator
{
System.out.println("\nMain menu");
System.out.println("    1 - View my balance");
System.out.println("    2 - Withdraw cash");
System.out.println("    3 - Deposit funds");
System.out.println("    4 - Exit");
System.out.print("Enter a choice:");
int SwitchChoice = keypad.nextInt();
switch(SwitchChoice)
{
    case 1:
        AtmData.ViewMyBalance(Balance);//$$$$$$$$$$$$$$$$$$$$$$$$ instantiate the object
        break;
    case 2:
        AtmData.WithdrawCash(Balance);//$$$$$$$$$$$$$$$$$$$$$$$$$$ instantiate the object
        break;
    case 3:
        AtmData.DepositFunds(Balance);//$$$$$$$$$$$$$$$$$$$$$$$$$$ instantiate the object
        break;
    case 4:
        Exit();
        break;
}

}
    }//From this point on it is Q2, Q3 These methods are in a seperate class
    public static void Exit()
    {
      System.exit(0);  
    }
}
