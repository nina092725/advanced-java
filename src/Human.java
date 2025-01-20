public class Human {
    // 属性
    private String name;//名前メソッド
    private int age;//年齢メソッド
    private String birthplace;//出身地メソッド

    // コンストラクタ
    public Human(String name, int age, String birthplace) {
        this.name = name;// 引数で渡されたnameの値を、オブジェクトのname属性に代入。thisは現在のオブジェクト自身を表す。
        this.age = age;
        this.birthplace = birthplace;
    }

    // toStringメソッド
    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", birthplace=" + birthplace + "]";
    }

    // getter/setterメソッド
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}