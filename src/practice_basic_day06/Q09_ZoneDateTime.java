package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {
        ZonedDateTime zoneDate= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        //String ifade önemli hatalı yazılırsa doğru saonuç dönmez ülke isimlerinde
        System.out.println("zoneDate = " + zoneDate);
        ZonedDateTime local=ZonedDateTime.now();
        System.out.println("local = " + local);
        DateTimeFormatter format= DateTimeFormatter.ofPattern(("dd.MM.yyy HH:mm"));
        System.out.println("losangels"+zoneDate.format(format));
        System.out.println("Türkiye"+local.format(format));

    }
}
