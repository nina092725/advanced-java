import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        // 自分の誕生日をLocalDateオブジェクトとして作成
        LocalDate myBirthday = LocalDate.of(1999, 9, 27);

        // 年、月、日を個別に取得
        int year = myBirthday.getYear();
        int month = myBirthday.getMonthValue();
        int day = myBirthday.getDayOfMonth();

        // 結果を出力
        System.out.println("私の誕生日は " + year + " 年 " + month + " 月 " + day + " 日です");
    }
}
