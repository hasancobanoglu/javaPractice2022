package practice_basic_day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Q04_LocalDate02 {
    public static void main(String[] args) {

        /*
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);
         */

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(LocalDate.of(2014, Month.JUNE, 21));

        System.out.println("2***********************************");
         LocalDate date1=LocalDate.of(2014,Month.JUNE, 21);
        System.out.println(date1);

        System.out.println("3***********************");
        LocalDate dt = LocalDate.of(2014,06,21);
        System.out.println(dt);
    }
}
