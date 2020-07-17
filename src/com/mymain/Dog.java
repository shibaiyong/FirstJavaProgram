package com.mymain;

import  java.util.Date;
import java.text.*;
import test.Test;
import java.io.Serializable;

public class Dog implements Serializable {

//    一个类可以有多个构造方法，在创建对象的时候至少调用一个构造方法;
    private int age = 4;
    public String name;
    public Dog(){
        System.out.println("这是第一个构造器");
    }
    static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    public Dog(String mingzi){
        name = mingzi;
        // 这个构造器仅有一个参数：name
        System.out.println("这是第二个构造器");
    }

    public void getAge(){
        //wang();
    }

    static void wang(){
        System.out.println("狗子不要叫");
    }

    static void dateparse(String[] args) {

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

    }


}
