//以下の Dog クラスを使用して、次のプログラムを作成しなさい。

// Dog クラスのインスタンスを作成する。
// SetName メソッドで名前を設定する。
// ShowProfile メソッドで名前を表示する
public class dog {
    private String Name;
    public void setName(String name){
        this.Name=name;
    }
    public void ShowProfile(){
        System.out.println("私の名前は"+Name+"です");
    }
    
}
