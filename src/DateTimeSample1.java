
    //alt+shift+Oでimportいれられる（クイック機能）
 import java.time.LocalDate;//日付と時刻を扱うためのクラスをインポート
 import java.time.LocalDateTime;
 import java.time.LocalTime;

 public class DateTimeSample1 {
 public static void main(String[] args) {
 // 日付を表すクラス
 LocalDate localDate = LocalDate.now();//nowの戻り値がLocalDateのインスタンス
 System.out.println("現在の日付:" + localDate);
 // 時間を表すクラス
 LocalTime localTime = LocalTime.now();//Localdateはクラス名
 System.out.println("現在の時間:" + localTime);
 // 日付と時間
 LocalDateTime localDateTime = LocalDateTime.now();
 System.out.println("現在の日付と時間:" + localDateTime);
 }
}


