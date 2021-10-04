package java202110;

/**
 * @ClassName ArrayTest
 * @Description 类的成员，方法的重载
 * @Author GOFAesir
 * @Data 2021/10/2
 **/
public class ArrayTest {
    public static void main(String[] args) {
        String[] a = new String[]{"jfsdksm","sjsnfksdkfm"};
        test t = new test();
        t.md("sldfjs","sjdsdklfm","sldnfsjidk");

    }
}

class test{
    int i = 1;
//    public void md(){
//        System.out.println(i);
//    }
    public void md(String ... p){
        System.out.println("this p");
        System.out.println(p[1]);
        System.out.println(p);
    }
}