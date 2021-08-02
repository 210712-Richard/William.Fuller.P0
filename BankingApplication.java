import java.util.Scanner;

class BankingApplication {


    public static void main(String[] args) {



    char option1 = '\0';
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Welcome to the Bank");
    System.out.println("L. Login");
    System.out.println("R. Register");
    System.out.println("E. Exit");
    System.out.println("choose an option.");
    do{

        option1 = scanner.next().charAt(0);
        System.out.println("\n");

        switch(option1){

            case 'L' :
                class BankAccount{
                    int balance;
                    int previousTransaction;
                    String customerName;
                    String customerId;
                    //created a bank account contructor to pass along values
                    BankAccount(String email, String username){
                        customerId = username;
                        customerName = email;
                    }

                    void deposit(int amount){
                        if(amount > 0){
                            balance = balance + amount;
                            previousTransaction = amount;
                        }
                    }
                    void withdraw( int amount){
                        if (amount > 0){
                            balance= balance - amount;
                            previousTransaction = -amount;
                        }
                    }
                    void getPreviousTransaction(){

                        if(previousTransaction > 0){
                            System.out.println("Deposited: " + previousTransaction);
                        }
                        else if (previousTransaction < 0){
                            System.out.println("Withdrew: " +Math.abs(previousTransaction));
                        }
                        else{
                            System.out.println("No Past Transaction");
                        }
                    }

                    void showMenu(){
                        //essentially like starting an int off at 0
                        char option = '\0';
                        Scanner scanner = new Scanner(System.in);

                        System.out.println("Welcome" + customerName);
                        System.out.println("Your Id is" + customerId);
                        System.out.println("\n");
                        System.out.println("A. Check Balance");
                        System.out.println("B. Deposit");
                        System.out.println("C. Withdraw");
                        System.out.println("D. Previous transaction");
                        System.out.println("E. Exit");

                        do {
                            System.out.println("==========");
                            System.out.println("Balance =" + balance);
                            System.out.println("==========");
                            //.next allows me to make an input in the terminal for index position zero (reads first letter of input)
                            option = scanner.next().charAt(0);
                            System.out.println("\n");


                            //switch statment allows for you to test a variable for equality against a list of values
                            switch(option){
                                //switch works with case to compare the variable for equality

                                case 'A' :
                                    System.out.println("Balance" + balance);
                                    break;

                                case 'B' :
                                    System.out.println("Enter Deposit Amount");
                                    int amount = scanner.nextInt();
                                    deposit(amount);
                                    break;

                                case 'C' :
                                    System.out.println("Enter Withdraw Amount");
                                    int amount2 = scanner.nextInt();
                                    withdraw(amount2);
                                    break;

                                case 'D' :
                                    getPreviousTransaction();
                                    break;

                                case 'E' :
                                    System.out.println("****************");
                                    break;

                                default:
                                    System.out.println("Invalid Option. TRY AGAIN");
                                    break;

                            }

                        } while(true);


        }




                }





            case 'R' :
                System.out.println("Please Register an Account");
                System.out.println("Enter a Username");
                Long username = scanner.nextLong();
                System.out.println("=============");
                System.out.println("Enter Email Address");
                Long email = scanner.nextLong();
                System.out.println("=============");
                System.out.println("Thank you!");
                //need a way to save username and email so that they can be used to login

                break;
                }


    }while(true);
        }





    }



