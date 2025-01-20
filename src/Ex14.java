public class Ex14 {
    public static void method1(){
        try {
            Class.forName("java.lang.NonExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        method1();
    }

}
