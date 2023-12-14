import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear;

        // kullanıcıdan aldığımız tarih bilgisi ile if koşullu değerlere göre Hayvan isimlerini eşliyoruz.
        System.out.print(" Doğum yılını giriniz  :  ");
        birthYear = input.nextInt();

        System.out.print("Çin Zordağı Burcunuz : ");
        if(birthYear % 12 == 0) System.out.println("Maymun");
        if(birthYear % 12 == 1) System.out.println("Horoz");
        if(birthYear % 12 == 2) System.out.println("Köpek");
        if(birthYear % 12 == 3) System.out.println("Domuz");
        if(birthYear % 12 ==4 ) System.out.println("Fare");
        if(birthYear % 12 == 5) System.out.println("Öküz");
        if(birthYear % 12 == 6) System.out.println("Kaplan");
        if(birthYear % 12 == 7) System.out.println("Tavşan");
        if(birthYear % 12 == 8) System.out.println("Ejderha");
        if(birthYear % 12 == 9) System.out.println("Yılan");
        if(birthYear % 12 == 10) System.out.println("At");
        if(birthYear % 12 == 11) System.out.println("Koyun");



    }
}
