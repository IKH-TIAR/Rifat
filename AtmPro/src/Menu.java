import java.util.Scanner;

public class Menu extends Login_Info {

    Scanner scanner = new Scanner(System.in);
    int choice;
    void mainMenu(){
        while (true){
            System.out.println("1.Rocket");
            System.out.println("2.Bkash");
            System.out.println("3.Nagad");
            System.out.println("4.Card");
            System.out.println("5.Exit");
            System.out.println("Enter Your choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();
            if(choice==5)return;
            login();

        }
    }
    void login(){
        System.out.println("Enter Username: ");
        String user=scanner.nextLine();
        int index=-1;
        for(int i=0; i< username.length; i++){
            if(username[i].equals(user)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Enter password: ");
            String pass=scanner.nextLine();
            if(password[index].equals(pass)){
                System.out.println("Welcome");
                menu(index);
            }else System.out.println("Incorrect Username");
        }else System.out.println("Invalid Username");
    }
    void menu(int index){
        while (true){
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Logout");
            System.out.println("Enter Your Choice: ");
            int ch=scanner.nextInt();
            switch (ch){
                case 1: deposit(index);
                        break;
                case 2: withdraw(index);
                        break;
                case 3: check(index);
                        break;
                case 4: return;
            }

        }
    }
    void deposit(int index){
        System.out.println("Enter amount: ");
        int amount= scanner.nextInt();
        rocket[choice-1][index]+=amount;
        System.out.println("Amount Added to account");
        System.out.println("Press 1 To Continue");
        scanner.next();
    }
    void withdraw(int index){
        System.out.println("Enter amount to withdraw: ");
        int amount= scanner.nextInt();
        rocket[choice-1][index]-=amount;
        if(rocket[choice-1][index]<0){
            System.out.println("Can't Be Withdrawn");
            rocket[choice-1][index]+=amount;
            return;
        }
        System.out.println("Withdrawn successfully");
        System.out.println("Press 1 To Continue");
        scanner.next();
    }
    void check(int index){
        int amount=rocket[choice-1][index];
        System.out.println("Your balance "+amount);
        System.out.println("Press 1 To Continue");
        scanner.next();
    }
}
