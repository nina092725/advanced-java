public class ExceptionSample {
    public static void main(String[] args) {
        
        System.out.println("プログラム開始");

        try {//クイックフィックスしてエラー直せる
            Class.forName("java.lang.NotExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();//ターミナルにあるエラーのこと
        }

        
        

        System.out.println("プログラム終了");
    }

}
