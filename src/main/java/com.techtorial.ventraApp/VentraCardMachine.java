package com.techtorial.ventraApp;

import java.util.ArrayList;

public class VentraCardMachine {

    private String location;
ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location){
        this.location=location;
        this.allCards=new ArrayList<VentraCard>();
    }

    public boolean addCard(VentraCard newCard){
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */
        // Check if the parameter object is in allCards list return false , if not add ventracord to the allcards list and return true
         // contains method or using cardnumber
        // What is the fullName for this object?
                       // email , phoneNumber , cardNumber


        // What is allCards ?
        // Arraylist of cards

//        for (VentraCard oldCard : allCards) {
//            if(oldCard.getCardNumber()==newCard.getCardNumber()){
//             return  false;
//            }
//        }
//        allCards.add(newCard);
//        return true;
        if (!allCards.contains(newCard)){
            allCards.add(newCard);
            System.out.println("THis card is succesfully added in the list");
            return true;
        }
        System.out.println("THis card is not  succesfully added in the list");
        return false;
    }

    public void printCardNumbers(ArrayList <VentraCard> cards){
        for (VentraCard card: cards) {
            System.out.println(card.getCardNumber());

        }
        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    }

    public boolean updateCard(long currentCardNumber, VentraCard newCard){
        // How can I find which card has this currentCardNumber?
        for (int i = 0; i <allCards.size() ; i++) {
            if (allCards.get(i).getCardNumber()==currentCardNumber){
                allCards.set(i,newCard);
                return true;
            }
        }

        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.
        */
        // We will replace current  ventra card with new ventra card
        return false;
    }



    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number is matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.

        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}
