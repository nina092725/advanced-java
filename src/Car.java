public class Car {
    private int speed;
    public void run() throws Exception {//runはExcwptionをThrowするよ
    speed += 10;
    if (speed >= 120) {
    // 120 以上になったら例外を発生させる
    throw new Exception("スピードの出し過ぎです");//throw new XXException("例外オブジェクトに詰めるエラーメッセージ");
    }
    }
     }