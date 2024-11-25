import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz => ");
        int a = scr.nextInt();

        System.out.print("İkinci kenarı giriniz => ");
        int b = scr.nextInt();

        double c = Math.sqrt((a*a + b*b));

        System.out.println("Hipotenüs = " + c);

        double u = (a+b+c)/2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println(alan);

    }
}
