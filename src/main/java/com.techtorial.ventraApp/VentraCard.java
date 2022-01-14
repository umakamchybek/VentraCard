package com.techtorial.ventraApp;

import java.util.Random;

public class VentraCard {
     private long cardNumber;
    private String email;
    private String fullName;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber() {
        this.cardNumber = createCardNumber();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String phoneNumber;
   public String getPhoneNumber(){
       return phoneNumber;

   }
   public void setPhoneNumber(String phoneNumber){
       this.phoneNumber=phoneNumber;
   }
   public VentraCard(String phoneNumber){
       this.phoneNumber = phoneNumber;
   }
    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */

    public VentraCard(  String fullName, String phoneNumber,String email) {
        this.cardNumber = createCardNumber();
        this.email = email;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public static VentraCard createCard(String fullName, String phoneNumber, String email){

    /*
    this method needs to return VentraCard according to the parameter
     */
        // What do we do for creating object in java?
        // USing new Keyword with class name
        return new VentraCard(fullName,phoneNumber,email);
    }

    public  long createCardNumber(){
        /*
        this method needs to return the 16 digit card number
         */
        // This method has to create random 16 digit number

        // Using random object we can get one digit .
        // I have to repeat this process 16 times.
        Random random = new Random();
        String str = "";
        for (int i = 0; i <=15; i++) {

            str+=random.nextInt(10);// 19
        }

        return Long.parseLong(str);
    }


}
