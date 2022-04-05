package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q05_LocalDate03 {
    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDate date = LocalDate.of(2018,Month.FEBRUARY, 29);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        //Invalid date 'February 29' as '2018' is not a leap year
        //artık yıl  olmadığından hata verir
            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.//doğru cevap
            */
      //  System.out.println(LocalDate.now().isLeapYear());
        //artık yıl olup olmadığını belirler boolean sonuç veri 2022 için false döndü
    }
}
