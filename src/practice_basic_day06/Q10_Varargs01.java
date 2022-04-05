package practice_basic_day06;

import java.util.Scanner;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments
        //Nothc
        //Varargs Java dilinde belirli bir türden sıfır veya daha fazla sayıda argümanı
        // bir metoda tek seferde geçmemizi sağlayan bir mekanizmadır.
        // Variable arity yani değişken sayılı argümanlar ifadesinin kısaltılmasıdır.
        // Arka planda bu mekanizma değişken sayıdaki argümanların toplanıp tek bir dizi içerisinde saklanması
        // ve bu dizinin metoda geçilmesi mantığıyla çalışır.
       /* Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int toplam=0;
        while ( sayi > 0) {
            System.out.println("İstediğin kadfar sayi gir:" + "\nsayiların toplami için 0 a bas");
            sayi = scan.nextInt();
                    toplam+=sayi;

           }
        System.out.println(toplam);
        */
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ".indexi sayiyi giriniz :");
            arr[i] = scan.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }

        System.out.println("toplam sayi :" + count);
        scan.close();

        }
    }










