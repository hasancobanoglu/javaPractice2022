package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    static void display(int num, String... values){
        System.out.println("Girilen Sayı: "+num);

        for(String s:values){
            System.out.println(s);
        }
    }

    public static void main(String args[]){

        display(500,"Merhaba");//Tek arümant
        display(1000,"Benim","Adım","Java","Varargs");//Çoklu argüment
    }




}
