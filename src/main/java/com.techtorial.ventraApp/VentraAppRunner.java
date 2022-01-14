package com.techtorial.ventraApp;

import java.util.Scanner;

public class VentraAppRunner {

   static VentraCardMachine machine = new VentraCardMachine("Chicago");

    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }

    private static void makeAChoice(String choice){
        Scanner s = new Scanner(System.in);
        Scanner forNextLine = new Scanner(System.in);
        switch (choice){
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
                System.out.println("Enter full name");
                String fullName = forNextLine.nextLine();
                System.out.println("Enter phone");
                String phoneNumber = s.next();
                System.out.println("Enter email");
                String email = s.next();

                VentraCard card = VentraCard.createCard(fullName,phoneNumber,email);
                System.out.println(machine.addCard(card));

                // Make createCard method in Ventra card static
                /*
                1- Using scanner get the information of User (FullName, PhoneNumber, Email)
                2- Create new card According to this information(Call createCard method)
                3- Call addCard method from VentraCard Machine and add new card
                 */
                break;
            case "2":

                break;
            case "3":
                machine.printCardNumbers(machine.allCards);
                break;
            case "4":
                System.out.println("Enter your current card number");
                long currentCardNumber = s.nextLong();
                System.out.println("Enter full name");
                String fullName1 = forNextLine.nextLine();
                System.out.println("Enter phone");
                String phoneNumber1 = s.next();
                System.out.println("Enter email");
                String email1 = s.next();

                VentraCard card1 = VentraCard.createCard(fullName1,phoneNumber1,email1);
                machine.updateCard(currentCardNumber,card1);
                break;
            case "5":
            case "6":

        }
    }

    public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

        System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card  with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To print available options");
        System.out.println("0 - To exit");
    }
}
