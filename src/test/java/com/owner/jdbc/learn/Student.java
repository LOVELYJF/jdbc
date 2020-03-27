package com.owner.jdbc.learn;

public class Student {

//    private static class SingletonStudentInstance{
//          private static final Student instance=new Student();
//     }

    private static Student sd ;

    public static Student getSd(){

        if(sd==null){

            sd = new Student();
        }

        return  sd;

    }

    private Student(){};


}
