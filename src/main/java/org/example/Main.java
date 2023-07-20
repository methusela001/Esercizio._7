package org.example;

public class Main {
    //If/else Statement

    public static void main(String[] args) {

        // Define a variable called myName and assign your name to it.
        String myName = ("Methusela");
        //Using the if-else statement, 
        int lengthOfName = myName.length();
        //print if the number of letters in your name is even or odd.
        if (lengthOfName % 2 !=0 ){
            System.out.println("The letters in my name are even");

        }else{
            System.out.println("The letters in my name are odd");
        };
    }
}
