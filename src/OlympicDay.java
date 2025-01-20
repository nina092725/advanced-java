import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Locale;

public class OlympicDay {
    public static void main(String[] args) {
        // オリンピック開会式の日付
        LocalDate olympicDay = LocalDate.of(2020, 7, 24);
        DayOfWeek olympicDayOfWeek = olympicDay.getDayOfWeek();

        // 自分の誕生日（例）
        LocalDate myBirthday = LocalDate.of(1990, 1, 1);
        DayOfWeek myBirthdayDayOfWeek = myBirthday.getDayOfWeek();

        // フォーマット設定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年 MM月 dd日 (E)", Locale.JAPANESE);

        // 結果出力
        System.out.println("2020年東京オリンピックの開会式は" + olympicDay.format(formatter) + "です");
        System.out.println("自分の誕生日である" + myBirthday.format(formatter) + "は" + myBirthdayDayOfWeek + "曜日です");
}
}

