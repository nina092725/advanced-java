import java.time.LocalDateTime;

public class DateTimeSample3 {
    public static void main(String[] args) {
        
        LocalDateTime localDateTime=LocalDateTime.of(2018,1,2,3,4,5,99999990);
        System.out.println("日付と時間:" + localDateTime);
 // 年月日時分秒ナノ秒を進める
localDateTime = localDateTime.plusYears(1);// localDateTime.plusYears(1);だけだと新たに日にちのオブジェクトが作られてしまうため注意！同じ変数に代入するには左辺に変数を書いて上書く
localDateTime = localDateTime.plusMonths(2);
localDateTime = localDateTime.plusDays(3);
localDateTime = localDateTime.plusHours(4);
localDateTime = localDateTime.plusMinutes(5);
localDateTime = localDateTime.plusSeconds(6);
localDateTime = localDateTime.plusNanos(7);
System.out.println("進めた後:" + localDateTime);

// 年月日時分秒ナノ秒を戻す
localDateTime = localDateTime.minusYears(1);
localDateTime = localDateTime.minusMonths(2);
localDateTime = localDateTime.minusDays(3);
localDateTime = localDateTime.minusHours(4);
localDateTime = localDateTime.minusMinutes(5);
localDateTime = localDateTime.minusSeconds(6);
localDateTime = localDateTime.minusNanos(7);
System.out.println("戻した後:" + localDateTime);

 // 2 週間前に戻すこともできる(進めることも可能)
localDateTime = localDateTime.minusWeeks(2);
System.out.println("2 週間前:" + localDateTime);
}
 }
    
