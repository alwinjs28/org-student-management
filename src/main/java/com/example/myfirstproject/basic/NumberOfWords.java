package com.example.myfirstproject.basic;

public class NumberOfWords {
    public static void main(String[] args) {
        String sentence = "This is Sudher Singh I am from Nagercoil This is my hometown";

        String numberOfWords[] = sentence.split(" ");

            //String newSentence = sentence.replace("is", "");
            //System.out.println(newSentence);

        System.out.println("Number of words : " + numberOfWords.length);
    }
}
