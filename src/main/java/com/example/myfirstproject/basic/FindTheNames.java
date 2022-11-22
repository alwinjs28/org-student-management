package com.example.myfirstproject.basic;

import java.util.Arrays;

public class FindTheNames {
    public static void main(String[] args) {
        String jsonResponse = "{'names':['Alwin', 'Jebin', 'David', 'Hari', 'Anish', 'Abish']}";

        String numberOfNames1 = jsonResponse.replace("}","");
        String numberOfNames2 = numberOfNames1.replace("{","");
        String numberOfNames3 = numberOfNames2.replace("]","");
        String numberOfNames4 = numberOfNames3.replace("[","");
        String numberOfNames5 = numberOfNames4.replace(":","");
        String numberOfNames6 = numberOfNames5.replace("'names'","");
        String numberOfNames7 = numberOfNames6.replace("'","");
        String numberOfNames8 = numberOfNames7.replace(",","");


        System.out.println("Number of names : " + numberOfNames8);
        String names[] = numberOfNames8.split(" ");
        for (int i=names.length-1;i>=0;i--){
            System.out.println("Names are : "+names[i]);
        }
        for (int i=0;i<names.length-1;i++){
            System.out.println("Names are : "+names[i]);
        }
        for(String name:names){
            System.out.println("Names:"+name);
        }
        System.out.println("Java 8");
        Arrays.stream(names).forEach(e -> System.out.println(e));


        System.out.println("Number of names count :"+names.length);
    }
}
