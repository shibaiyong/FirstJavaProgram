package test;

public enum Color {
    RED("红"){
        public void colorInfo(){
            System.out.println("红色");
        }
    },BLUE("蓝"){
        public void colorInfo(){
            System.out.println("蓝色");
        }
    },YELLOW("黄"){
        public void colorInfo(){
            System.out.println("黄色");
        }
    };
    private final String name;
    // 枚举类的构造器只能使用private修饰
    private Color(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        System.out.println(this.name);
    }
    public abstract void colorInfo();
}
