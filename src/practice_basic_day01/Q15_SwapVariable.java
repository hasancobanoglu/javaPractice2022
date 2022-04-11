package practice_basic_day01;

public class Q15_SwapVariable {
    public static void main(String[] args) {
        int s=30;
        int s1=40;
        System.out.println("s = " + s +" s1 ="+s1);

        int temp=s;
        s=s1;

        s1=temp;

        System.out.println("s = " + s+"s1= "+s1);


    }
}
