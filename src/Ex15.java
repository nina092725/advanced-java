public class Ex15 {
    public static void main(String[] args) {
        Car1 car = new Car1();

        // スピード40km/h
        car.run(40);

        // スピード200km/h※例外処理発生
        try {
            car.run(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());//例外オブジェクトが持つメッセージを取得するメソッド
            e.printStackTrace();//例外のスタックトレースを出力するメソッド
            
        }
    }
}