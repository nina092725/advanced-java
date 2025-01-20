import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex09 {
    public static void main(String[] args) {
        // 2020年1月1日0時0分0秒のLocalDateTimeオブジェクトを作成
        LocalDateTime startDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

        // 1年2ヶ月3日4時間5分6秒後を求める
        LocalDateTime resultDateTime = startDateTime
                .plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(5)
                .plusSeconds(6);

        // 結果を出力
        System.out.println(resultDateTime);
    }
}