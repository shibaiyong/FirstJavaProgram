package com.mymain;
import test.GreetClient;
import test.GreetServer;

import test.Test;
import test.SendMail;
import java.util.Arrays;
import  java.util.Date;
import java.text.*;
import java.io.IOException;


public class HelloWord {
    public static void main(String[] args) throws IOException{
        Test test = new Test();
        Test subtest = new SubTest();
        GreetServer greetserver = new GreetServer(1234);
        //Dog dog = new Dog("小狗");
        //dog.getAge();
        //Dog.wang();

        //自动类型转换
        int a = 60;
        byte b = (byte)a;
        char aa = '\u6211';
        int bb = aa;
        Integer Aint = 4;
        //System.out.println(~a);
        char uniChar = '\u039A';

        int[] arr = {1,2,3,4,56,7};

        Arrays.sort(arr);

        StringBuffer sBuffer = new StringBuffer("www.");
        sBuffer.append("shibaiyong.com");

        Date date = new Date();

        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss EE F W");

        //System.out.println(date);
        //Math类
        //System.out.println("PI/2的正弦值:"+Math.sin(Math.PI/2));SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//        Dog.dateparse(new String[]{"2017-12-01"});

        //java正则表达式


        //test.RegExpression();

        //可变参数
        double[] otherparams = {1, 2, 3};
        //test.printMax(2,new double[]{1, 2, 3});

        //java流，文件，输入，输出

        //test.readConsoleIO();

        //test.readConsoleLineIO();

        //test.fileIOstream();// 此方法写入数据时，文件里内容乱码。
        //test.fileIOstreamNew();

        //test.handleScanner();
        //test.handleException();
        //System.out.println("异常中断了程序的执行");

        //继承super的用法。

        //System.out.println(subtest.age);

        //重写
        //test.printMax(2,new double[]{2,3});
        //subtest.printMax(2222,new double[]{1,3});
        //调用了subtest继承test实现的Animal接口中的eat方法。
        //subtest.eat();
        //subtest.bark();//如果引用类型是子类的父类，那么它会在父类中寻找该方法。其实是java多态调用

        //枚举
        //test.handleEnum();

        //集合框架 ArrayList
        //test.handleArrayList();

        //集合HashMap
        //test.handleHashMap();

        //泛型方法
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        //test.printArray(intArray);
        //test.printArray(doubleArray);
        //test.printArray(charArray);

        //序列化
        //test.handleSeralize();
        //sockt 网络编程
        //greetserver.run();
        SendMail sendmail = new SendMail();
        sendmail.send();
    }
}
