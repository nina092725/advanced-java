public class Car1 {
    private int speed;
    public void run(int speed){
        if(speed<0 || 180<speed){
            throw new IllegalArgumentException("スピードの出しすぎです");

        }
        this.speed=speed;//オブジェクトの状態を更新し、そのオブジェクトが表す実世界の状態を反映させるため
        System.out.println("スピードが"+speed+"km/hになりました");
    }



}
