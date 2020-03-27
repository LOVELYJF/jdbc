package com.owner.jdbc.learn;

public class Dtl {

    private int nian;

    private int yue;


    public Dtl(int nian, int yue) {
        this.nian = nian;
        this.yue = yue;
    }

    public Dtl(){


    }

    public int getNian() {
        return nian;
    }

    public void setNian(int nian) {
        this.nian = nian;
    }

    public int getYue() {
        return yue;
    }

    public void setYue(int yue) {
        this.yue = yue;
    }
}
