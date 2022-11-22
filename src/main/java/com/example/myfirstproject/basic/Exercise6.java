package com.example.myfirstproject.basic;

import com.example.myfirstproject.util.Constants;

public class Exercise6 {
    public static void main(String[] args){
        String word1 = "Hellow";
        String word2 = "World";
        String word = word1 + Constants.whiteSpace + word2;
        System.out.println(word);

        String middleOne = "-----";
        //System.out.println(word);

        String wordNew = "Hello";
        wordNew = wordNew.concat(Constants.whiteSpace).concat(Constants.name);
        System.out.println(wordNew);

        String company = "My TATA";

        company = company.replace(Constants.whiteSpace, Constants.hyphen);
        System.out.println(company);

    }
}
