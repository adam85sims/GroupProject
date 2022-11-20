/*
* Very rough framework to build upon. THIS NEEDS TIDIED UP - A LOT!
* This loops through and gives the option to sell adult, child or senior tickets.
* There is no functionality built in to have adult AND child yet - but it's a start.
* Number of tickets sold is tracked, but not used in the program or displayed yet.
* Could add a discount for family tickets.
* Could add a refund option.
* Age is built in, but could be removed and just have a ticket type.
* Should add in a final variable for cinema name and use it in the output.
* Program currently uses:
* - if/else
* - while
* - switch
* - objects
* - methods/classes
* - constructors
* We would still need to add in:
* - arrays
* - file reading/writing
* - exception handling
* */

import java.util.Scanner;

public class Main {
    //variables for cinema ticket system
    private static int adultTickets = 0;
    private static int childTickets = 0;
    private static int seniorTickets = 0;
    private static int totalTickets = 0;
    private static double totalSales = 0.0;

    public static void main(String[] args){
        //variables for user input
        int userChoice = 0;
        int userTickets = 0;
        Scanner input = new Scanner(System.in);

        //loop to keep program running until user quits
        while(userChoice != 4){
            //display menu
            System.out.println("Welcome to the Cinema Ticket System thing. \nWhat would you like to do?");
            System.out.println("1. Sell Tickets");
            System.out.println("2. View Sales");
            System.out.println("3. View Tickets Sold");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            userChoice = input.nextInt();

            //switch statement to handle user input
            switch(userChoice){
                case 1:
                    //variables for user input
                    int userAge = 0;
                    int userTicketType = 0;

                    //display menu
                    System.out.println("1. Adult");
                    System.out.println("2. Child");
                    System.out.println("3. Senior");
                    System.out.print("Enter your choice: ");
                    userTicketType = input.nextInt();

                    //display menu
                    System.out.print("Enter number of tickets: ");
                    userTickets = input.nextInt();

                    //switch statement to handle user input
                    switch(userTicketType){
                        case 1:
                            //variables for user input
                            System.out.print("Enter age: ");
                            userAge = input.nextInt();

                            //if statement to handle user input
                            if(userAge >= 18){
                                //call method to sell tickets
                                new sellTickets(userTickets, 10.00);
                            }else{
                                //call method to sell tickets
                                new sellTickets(userTickets, 8.00);
                            }
                            break;
                        case 2:
                            //call method to sell tickets
                            new sellTickets(userTickets, 6.00);
                            break;
                        case 3:
                            //call method to sell tickets
                            new sellTickets(userTickets, 7.00);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;
                case 2:
                    //call method to display sales over a given period of time - option to export as CSV?
                    new displaySales();
                    break;
                case 3:
                    //call method to display tickets sold for this transaction - could maybe print a receipt
                    new displayTicketsSold();
                    break;
                case 4:
                    System.out.println("Thanks for using the Cinema Ticket System thing.\nOr whatever else it's called.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

