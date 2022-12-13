package Baslangic;
import java.util.Scanner;
public class Kasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double Armut, Elma, Domates, Muz, Patlican;
        int kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        kiloArmut = input.nextInt();
        System.out.print("Elma Kaç Kilo ? ");
        kiloElma = input.nextInt();
        System.out.print("Domates Kaç Kilo ? ");
        kiloDomates = input.nextInt();
        System.out.print("Muz Kaç Kilo ? ");
        kiloMuz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? ");
        kiloPatlican = input.nextInt();
        Armut = kiloArmut * armut;
        Elma = kiloElma * elma;
        Domates = kiloDomates * domates;
        Muz = kiloMuz * muz;
        Patlican = kiloPatlican * patlican;
        System.out.print("Toplam Tutar : " + (Armut + Elma + Domates + Muz + Patlican));
    }
}
