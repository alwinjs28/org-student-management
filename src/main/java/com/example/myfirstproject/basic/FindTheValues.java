package com.example.myfirstproject.basic;

public class FindTheValues {
    public static void main(String args[]){

        String jsonResponse = "{'names':['Alwin','Jebin','David','Hari','Anish','Abish']}";
        String names1 = jsonResponse.replace("{","");
        String names2 = names1.replace("}","");
        String names3 = names2.replace("[","");
        String names4 = names3.replace("]","");
        String names5 = names4.replace(":","");
        String names6 = names5.replace("names","");
        String names7 = names6.replace("'","");
        System.out.println(names7);
        String names[] = names7.split(",");
        for (String name:names){
            System.out.println("Name:"+name);
        }
    }
}
