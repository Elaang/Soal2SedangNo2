package Sekolah.UKL;
import java.util.Scanner;
import java.lang.Math;

public class VolumeTabong {
      static double hitungVolumeJariJari(double r, double t) {
        double volume = Math.PI * r * r * t; 
        return volume;
      }
        static double hitungVolumeDiameter(double d, double t) {
        double volume = Math.PI * d * t; 
        return volume;
      }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kamu mau input jari jari atau diameter tabung?");
        System.out.println("jari-jari / diameter");
        String pilihan = input.nextLine();
        if (pilihan.equalsIgnoreCase("diameter")) {
          System.out.print("Masukkan diameter alas tabung (d): ");
            double d = input.nextDouble();
            double r = d / 2;
          System.out.print("Masukkan tinggi tabung (t): ");
            double t = input.nextDouble();
            double volume = hitungVolumeDiameter(r, t);
          System.out.printf("Volume tabung dengan diameter " + d + " dan tinggi " + t + " adalah " + volume);
          input.close();
          return;
        } else if (!pilihan.equalsIgnoreCase("jari-jari")) {
            System.out.print("Masukkan jari-jari alas tabung (r): ");
                double r = input.nextDouble();
            System.out.print("Masukkan tinggi tabung (t): ");
                double t = input.nextDouble();
                double volume = hitungVolumeJariJari(r, t);
            System.out.printf("Volume tabung dengan jari-jari " + r + " dan tinggi " + t + " adalah " + volume);
        } else {
          System.out.println("Rage bait used to be believable.");
          System.out.println("You shall PERISH!");
          System.out.println("Goodbye.");
          System.out.println("--------------------------------");
          System.out.println("anu, kepencet ini");
          System.exit(0);
        }
        input.close();
      }
}
