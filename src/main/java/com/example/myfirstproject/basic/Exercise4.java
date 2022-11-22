package com.example.myfirstproject.basic;

public class Exercise4 {
    public static void main(String[] args) {
        String sentence = "My name is Sudher Singh from Karungal, I studied in Karungal college of Engineering";

        String collegeName = "Tamizhan";
        String splitSentence[] = sentence.split(",");
        String words = splitSentence[1];
        String replaceSentence = words.replace("Karungal",collegeName);
        String correctSentence = splitSentence[0]+","+ replaceSentence;
        System.out.println(correctSentence);
        /*
        OUTPUT: -> My name is Sudher Singh from Karungal, I studied in Tamizhan college of Engineering
         */

        /*

        String collegeName = "Xavier";

        System.out.println(sentence);

        OUTPUT: -> My name is Sudher Singh from Karungal, I studied in Xavier college of Engineering

         */
    }
}
