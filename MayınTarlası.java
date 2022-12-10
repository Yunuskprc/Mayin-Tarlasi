import java.util.Scanner;

public class MayınTarlası {
    public static void main(String[] args) {
        int[][] dizi = new int[10][10];
        int satirMayin, sutunMayin, satir, sutun, puan = 0;
        Scanner scann = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            satirMayin = (int) (Math.random() * 10);
            sutunMayin = (int) (Math.random() * 10);
            dizi[satirMayin][sutunMayin] = 1;
        }

        while (true) {
            System.out.println("Satir degerini girin:");
            satir = scann.nextInt();
            System.out.println("Sutun degerini girin:");
            sutun = scann.nextInt();

            if (dizi[satir][sutun] == 1) {
                System.out.println("Oyun bitti Mayina denk geldiniz\t Puan: " + puan);
                break;
            } else {
                puan++;
                System.out.println("Adim Basarili!!!\n");
            }

        }
    }

}
