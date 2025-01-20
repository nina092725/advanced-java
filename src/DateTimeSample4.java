import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
// 日付を表すクラス
LocalDate localDate = LocalDate.now();//現在の年月日を取得
System.out.println("現在の日付:" + localDate);
System.out.println("月末は"+ localDate.with(TemporalAdjusters.lastDayOfMonth()));//localDateをその月の最終日に調整
// 時間を表すクラス
LocalTime localTime = LocalTime.now();
System.out.println("現在の時間:" + localTime);
// LocalTime は月の情報がないため使用できない
// System.out.println("月末は"
//+ localTime.with(TemporalAdjusters.lastDayOfMonth()));
// 日付と時間
LocalDateTime localDateTime=LocalDateTime.now();
System.out.println("現在の日付と時間"+localDateTime);
System.out.println("月末は"+localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

    }
}