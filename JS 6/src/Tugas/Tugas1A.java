package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1A {
    public static void main(String[] args) {
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

        String a,b,c;
        float nilai1, nilai2, nilai3;
        double avg;

        try{
            System.out.print("Masukan Nilai Pertama : ");
            a = masuk.readLine();
            nilai1 = Float.parseFloat(a);

            System.out.print("Masukan Nilai Kedua   : ");
            b = masuk.readLine();
            nilai2 = Float.parseFloat(b);

            System.out.print("Masukan Nilai Ketiga  : ");
            c = masuk.readLine();
            nilai3 = Float.parseFloat(c);

            avg = ((nilai1 + nilai2 + nilai3)/3);


            System.out.println("\nNilai 1  : " + nilai1);
            System.out.println("\nNilai 2  : " + nilai2 );
            System.out.println("\nNilai 3  : " + nilai3);
            System.out.println("\nRata - Rata Nilai = " +avg);

            if(avg >=60){
                System.out.println("\nSelamat Kamu Berhasil ! :-) ");
            }
            else{
                System.out.println("\nMaaf Kamu Belum Berhasil ! :-(  ");
            }

        }

        catch (IOException e){
            System.out.println("Gagal Membaca Keyboard");
        }
    }
}
