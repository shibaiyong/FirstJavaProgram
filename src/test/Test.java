package test;

import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import java.util.Iterator;

public class Test implements Animal{

    private String color = "black";
    public int age;

//    public String name = "test";

    final int contant = 123;

    static int somenum = 22;

//    一个类可以有多个构造方法，在创建对象的时候至少调用一个构造方法。

    public Test(){
        age = 1;
    }
    public Test(int i){
        age = i;
    }
//不加任何访问控制修饰符，默认为default，此时该方法只能被同包的其它类访问。外包的类无法访问。
    static void fun1(){
        Test test1= new Test();

        System.out.println("静态方法不可以使用非静态变量");
    }

    //java 正则表达式

    public void RegExpression(){
        //捕获组
        String line = "this order was placed fro QT3000! OK?";
        String line2 = "fooooooooooooo";
        String line3 = "ooofoooooooo";
        String pattern = "(\\d+)(\\D*)(.*)";
        String pattern2 = "foo";
        // 创建Pattern 对象
        Pattern reg = Pattern.compile(pattern);
        Pattern reg2 = Pattern.compile(pattern2);
        //创建matcher对象
        Matcher mat = reg.matcher(line);
        Matcher mat2 = reg2.matcher(line2);
        Matcher mat3 = reg2.matcher(line3);
        System.out.println( mat2.matches() );
        System.out.println( mat2.lookingAt() );//true
        System.out.println( mat3.lookingAt() );//false  该方法需要从字符串的开头开始匹配。
        if(mat.find()){

//            System.out.println(mat.group(0));
////            System.out.println(mat.group(1));
////            System.out.println(mat.group(2));
////            System.out.println(mat.group(3));
////            System.out.println( mat.start() );
        }else{
            System.out.println("no match");
        }
    }

    public void printMax( int a,double... numbers) {
        System.out.println("The first value is " + a);
        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            result = numbers[i];
            System.out.println("The others value is " + result);
        }

    }

    public void readConsoleIO() throws IOException{
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符s
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    public void readConsoleLineIO() throws IOException{
        String c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to exit.");
        // 读取字符s
        do {
            c = br.readLine();
            System.out.println(c);
        } while (!c.equals("end"));
    }

    //文件写入，文件读出的实现;这种实现有乱码。
    public void fileIOstream(){
        try{
            OutputStream file1 = new FileOutputStream("C:/Users/RYX/Desktop/a.txt");
            byte[] content = {1,3,4,5,6,7,7,9,9};
            file1.write(content);
            file1.close();
            InputStream file2 = new FileInputStream("C:/Users/RYX/Desktop/a.txt");
            int size = file2.available();
            System.out.println(size);
            for(int i = 0; i < size; i++){
                System.out.println(file2.read());
            }
            file2.close();
        }catch (IOException e){
        }
    }
    //解决乱码问题
    public void fileIOstreamNew() throws IOException{
        //File file = new File();
        String str;
        InputStream inputF = new FileInputStream("C:/Users/RYX/Desktop/b.txt");
        InputStreamReader readerF = new InputStreamReader(inputF,"utf-8");
        BufferedReader BreaderF = new BufferedReader(readerF);
        OutputStream outF = new FileOutputStream("C:/Users/RYX/Desktop/a.txt");
        OutputStreamWriter writerF = new OutputStreamWriter(outF,"utf-8");
        writerF.append("解决乱码问题");
        writerF.append("\r\n");
        writerF.append("英文输入");
        while((str = BreaderF.readLine()) != null){
            writerF.append(str);
        }
        //关闭写入流,同时会把缓冲区内容写入文件
        writerF.close();
        //关闭输出流，同时释放系统资源。
        outF.close();

        // 关闭读取流
        readerF.close();

        // 关闭输入流,释放系统资源
        inputF.close();

    }

    //scanner 扫描
    public void handleScanner(){
        int i = 0;
        int  sum = 0;
        Scanner scannerConsole = new Scanner(System.in);
        while(scannerConsole.hasNextInt()){
            i++;
            sum += scannerConsole.nextInt();
        }
        System.out.println("输入的数据总和：" + sum);
        System.out.println("输入的数据的平均值：" + sum/i);
        scannerConsole.close();
    }

    //异常处理

    public void handleException(){
        //这种运行时异常，默认注入到所有java程序中。
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }

    }

    //实现接口
    public void traval(){
        //如果类里没有定义name成员变量，则name指向接口里的成员变量。
        System.out.println(name);
    }

    public void eat(){
        System.out.println("在test类里实现接口的方法体");
    }


    //枚举
    public void handleEnum(){
        Color c1 = Color.RED;
        //System.out.println(c1);
        //迭代枚举元素
        for(Color item: Color.values()){
            item.colorInfo();
            item.getName();
        }

    }

    //集合框架ArrayList类的增、删、改、查。<Object type>也就是基本数据类型的包装类。
    public void handleArrayList(){
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("一");
        arraylist.add("二");
        arraylist.add("三");
        System.out.println(arraylist);
        //常规遍历
//        for(int i = 0; i < arraylist.size(); i++){
//            System.out.println(arraylist.get(i));
//            arraylist.set(i,arraylist.get(i)+"1");
//        }
        //迭代器遍历,将集合用迭代器包装处理，然后利用迭代器的方法处理原来的集合。
        Iterator<String> it = arraylist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(arraylist);

        arraylist.remove(2);

        System.out.println(arraylist);
    }
    //集合框架ArrayList类的增、删、改、查。<Object type>也就是基本数据类型的包装类。
    public void handleHashMap(){
        HashMap<String,Integer> hashmap = new HashMap<>();
        //Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("one",1);
        hashmap.put("two",2);
        hashmap.put("three",3);
        System.out.println(hashmap);
        //常规遍历
//        for(String i : hashmap.keySet()){
//            System.out.println(hashmap.get(i));
//            hashmap.put(i,hashmap.get(i)+1);
//        }
        //利用迭代器遍历
//        Iterator<Map.Entry<String,Integer>> it = hashmap.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<String, Integer> entry = it.next();
//            System.out.println(entry.getKey()+entry.getValue());
//        }
        //推荐：尤其大容量的时候    Map.Entry<String, Integer>效果一样
        for (HashMap.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        System.out.println(hashmap);
        hashmap.remove("one");
        System.out.println(hashmap);
    }

    //泛型方法
    // 创建不同类型数组： Integer, Double 和 Character

     public < E > void printArray( E[] inputArray ) {
          // 输出数组元素
             for ( E element : inputArray ){
                System.out.printf( "%s ", element );
             }
             System.out.println(inputArray);
     }

}
