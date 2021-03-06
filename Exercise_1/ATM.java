import java.util.*;

public class ATM {
    
    public static void main(String[] args) {
        //creates 10 accounts
        final int MAX=10;

        Account[] accounts = new Account[MAX];

        for(int i=0; i<accounts.length; i++)
        {
            accounts[i] = new Account(i, 100.0);
        }

        //ATM
        while(true)
        {
            //user login
            Scanner keyboard = new Scanner(System.in);

            System.out.print("\nEnter an id: ");
            int id = keyboard.nextInt();

            //serve the user
            while(true)
            {
                //print menu
                int choice = menu();

                //balance
                if(choice==1)
                {
                    System.out.println("Your balance is $" + accounts[id].get_balance());
                }
                //withdraw
                else if(choice==2)
                {
                    System.out.println("Enter your withdraw amount: ");
                    double amount=keyboard.nextDouble();
                    accounts[id].withdraw(amount);
                }
                //deposit
                else if(choice==3)
                {
                    System.out.println("Enter your deposit amount: ");
                    double amount = keyboard.nextDouble();
                    accounts[id].deposit(amount);
                }
                //user exit
                else if(choice==4)
                {
                    System.out.println("Have a good day!");
                    break;
                }
                //invalid input exeption
                else
                {
                    System.out.println("Invalid input, please choose 1-4");
                }

            }

        }



    }

    public static int menu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nMain Menu");
        System.out.println("1: Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
        System.out.print("Enter a choise: ");
        int choice = keyboard.nextInt();
        return choice;
    }

}
