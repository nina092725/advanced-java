import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Locale;

public class Ex10 {
    public static void main(String[] args) {
        // 2020年7月27日のLocalDateオブジェクトを作成
        LocalDate targetDate = LocalDate.of(2020, 7, 27);

        // フォーマットパターンを指定して文字列に変換
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedString1 = targetDate.format(formatter1);
        System.out.println(formattedString1); // 出力: 2020/07/27

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日");
        String formattedString2 = targetDate.format(formatter2);
        System.out.println(formattedString2); // 出力: 2020 年 7 月 27 日

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日(E)", Locale.JAPANESE);
        String formattedString3 = targetDate.format(formatter3);
        System.out.println(formattedString3); // 出力: 2020 年 07 月 27 日(月)
    }
}


