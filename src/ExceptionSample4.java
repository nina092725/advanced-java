public class ExceptionSample4 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("プログラム開始");
        method1();
        System.out.println("プログラム終了");

    }
    public static void method1() throws ClassNotFoundException{
        Class.forName("java.lang.NotExistClass");
    }

}
