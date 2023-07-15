package org.example;

public class Main {
    //If/else Statement

    public static void main(String[] args) {

        // Define a variable called myName and assign your name to it.
        String myName = ("Methusela")
        //Using the if-else statement, print if the number of letters in your name is even or odd.
        int lengthOfName = myName.length();
        if (lengthOfName % 2 !=0 ){
            System.out.println("the letters in my name's are even");

        }else{
            System.out.println("the letters in my name's are odd");

        };
    }
}