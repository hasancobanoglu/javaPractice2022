package practice_basic_day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Q06_LocalDate04 {
    public static void main(String[] args) {

          /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?

        not HC:
        Java 8'den önce, java.util.Date , Java'daki
        tarih-saat değerlerini göstermek için en sık kullanılan sınıflardan biriydi.
        Java 8'den sonra , java.time.LocalDateTime ve  java.time.ZonedDateTime'ı tanıttı  .
        Java 8 ayrıca java.time.Instant kullanarak zaman çizelgesinde belirli bir saati temsil etmemize izin verir .
        Java 8 veya sonraki sürümlerinde, bir java.time.LocalDateTime veya java.time.
        ZonedDateTime örneğine saat ekleme , oldukça basittir ve  plusHours () yöntemini kullanır:

        */

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);//burada iki tarih içinde atama yapılmadığı için immuatable değiştirilemiyor ve sout da aynı tarihi verir
       // date=date.plusYears(3);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

/*
            A. 2018 APRIL 2
            B. 2018 APRIL 30****cevap
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. A runtime exception is thrown.
 */
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime :"+dateTime);
        dateTime = dateTime.plusHours(2);
        System.out.println("plus dateTime:"+dateTime);
        dateTime = dateTime.minusHours(4);
        System.out.println("minus dateTime:"+dateTime);
        dateTime = dateTime.plusYears(2);
        System.out.println("plus years:"+dateTime);
    }
}