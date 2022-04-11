package practice_basic_day01;

import java.util.Scanner;

public class Q16_Scanner {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("dairenin alani : " + 3.14* yaricap*yaricap);
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Çemberin yarıçapini gir ");
       double yaricap=scan.nextDouble();
        System.out.println("Çevre"+ 2*3.14*yaricap);
        System.out.println("Alan"+3.14*yaricap*yaricap);

    }
}
