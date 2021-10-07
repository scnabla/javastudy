package java202110;

/**
 * @ClassName TestA
 * @Description 饿汉式的单例模式
 * @Author GOFAesir
 * @Data 2021/10/7
 **/
public class TestA {
    public static void main(String[] args) {
        T test = T.getTest();
        T test1 = T.getTest();
        System.out.println(test);
        System.out.println(test1);
    }
}
class T{
    private T(){

    }
    private static T a = new T();
    public static T getTest(){
        return a;
    }
}
