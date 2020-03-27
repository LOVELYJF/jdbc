package com.owner.jdbc.entity;

public enum Student {

    WJF(1,24,"帅气"),
    SD(2,25,"难看");


    private final int id;

    private final int age;

    private final String desc;

    private Student(int id, int age, String desc) {
        this.id = id;
        this.age = age;
        this.desc = desc;
    }

    public static Student[]  getValue(){

        Student[] sd =values();

        return sd;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }
}
