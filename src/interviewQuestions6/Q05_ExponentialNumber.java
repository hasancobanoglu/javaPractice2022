package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        System.out.println("Math ile Çözüm");
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabanı Giriniz");
        int sayi1= scan.nextInt();
        scan.nextLine();           //Dummy
        System.out.println("Üssü Giriniz");
        int sayi2= scan.nextInt();
        scan.nextLine();        //dummy
        System.out.println(Math.pow(sayi1,sayi2));

        System.out.println("");
        System.out.println("***2 Çözüm for ile****");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen taban ve us giriniz :");
        int taban = scan1.nextInt();
        int us = scan1.nextInt();
        int sonuc =1;
        //    while(us !=0){
        //        sonuc*=taban;
        //        us--;
        //    }
        //    System.out.println("while ile :"+sonuc);
        for(int i = 0; i <us;i++){
            sonuc*=taban;
        }
        System.out.println("for ile :" + sonuc) ;
    }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve us giriniz :");
        int taban = scan.nextInt();
        int us = scan.nextInt();

        int sonuc =1;

    //    while(us !=0){
    //        sonuc*=taban;
    //        us--;
    //    }
    //    System.out.println("while ile :"+sonuc);


        for(int i = 0; i <us;i++){
            sonuc*=taban;
        }
        System.out.println("for ile :" + sonuc) ;
    }


