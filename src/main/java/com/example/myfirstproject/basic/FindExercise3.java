package com.example.myfirstproject.basic;

public class FindExercise3 {
    public static void main(String[] args) {
        String jsonResponse = "{'students':['Alwin','Jebin',   'David',    'Hari','Anish','Abish'], 'staff':['Dani','Lalin','Felix','Ion','Sherin','Dass']}";
        String nameArray []=jsonResponse.split("staff");
//        for (int i=0; i<nameArray.length;i++){
            String names = nameArray[0];
            names = names.replace("{","");
            names = names.replace("students","");
            names = names.replace(":","");
            names = names.replace("[","");
            names = names.replace("]","");
            names = names.replace("'","");
            System.out.println(names);
            names.replace(" ","");
            System.out.println(names);

            String name[] = names.split(",");
            for (String studentName:name){
                //System.out.println("Names:"+studentName);
            }
            //break;
//        }

    }
}
