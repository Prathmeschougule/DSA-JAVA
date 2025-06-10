package oop.staticExample;

public class StaticBlog {

    static  int a =12;
    static int  b ;

//    im a static only run one
    static{
        System.out.println("Im in a static blog ");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlog obj = new StaticBlog();
        System.out.println(StaticBlog.a + " " + StaticBlog.b);

        StaticBlog.b *= 3;
        System.out.println(StaticBlog.a + " " + StaticBlog.b);

        StaticBlog obj2 = new StaticBlog();
        System.out.println(StaticBlog.a + " " + StaticBlog.b);



    }

}
