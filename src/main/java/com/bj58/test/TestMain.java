package com.bj58.test;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TestMain {
    public static void main(String[] args) {
        System.out.println("hello world");
        getDate();
    }
    //test
    private static void getDate(){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH-mm-ss");
        Date date=new Date();
        String dateString=sdf.format(date);
        System.out.println(dateString);
    }
}
