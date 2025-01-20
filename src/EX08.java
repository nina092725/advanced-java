import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class EX08 {
    public static void main(String[] args) {
        // 2020年2月1日のLocalDateオブジェクトを作成
        LocalDate firstDayOfFeb2020 = LocalDate.of(2020, 2, 1);

        // 2月の最終日を取得
        LocalDate lastDayOfFeb2020 = firstDayOfFeb2020.with(TemporalAdjusters.lastDayOfMonth());

        // 2月の最終日の日を取得
        int lastDay = lastDayOfFeb2020.getDayOfMonth();

        // 結果を出力
        System.out.println(lastDay);
    }
}
