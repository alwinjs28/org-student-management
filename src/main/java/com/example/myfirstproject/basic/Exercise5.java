package com.example.myfirstproject.basic;

import com.example.myfirstproject.util.Constants;

public class Exercise5 {
    public static void main(String[] args) {
        String sentence = "My address is S/o Russel Raj, Pootetti, Karungal, KKDist, India";

        String myFirstName = "Sudher";
        String myMiddleName = "Singh";
        String myLastName = "R";

        String state = "Tamil Nadu";


        int a = 10;
        int b = 10/0;

        sentence = sentence.replace("S/o"," "+myFirstName+ Constants.whiteSpace+myMiddleName+" "+myLastName+","+" "+"S/o");
        sentence = sentence.replace("KKDist","KKDist"+","+" "+state);


        System.out.println(sentence);
        /*
        OUTPUT ->My address is Sudher Singh R, S/o Russel Raj, Pootetti, Karungal, KKDist, Tamil Nadu, India";
         */

        /*          //After changing the value
        String myFirstName = "Rejin";
        String myMiddleName = "";
        String myLastName = "R";

        String state = "Kerala";
        OUTPUT -> "My address is Rejin R, S/o Russel Raj, Pootetti, Karungal, KKDist, Kerala, India";
        */
    }
}
