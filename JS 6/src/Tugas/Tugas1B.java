package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
*/

import javax.swing.JOptionPane;

public class Tugas1B {
    public static void main(String[] args) {
        
        int nilai1, nilai2, nilai3;
        double avg;
        String hasil;
        
        nilai1 = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Pertama   : "));
        nilai2 = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Kedua     : "));
        nilai3 = Integer.valueOf(JOptionPane.showInputDialog("Input nilai Ketiga    : "));
        
        avg = ((nilai1+nilai2+nilai3)/3);

        if(avg >= 60){
            hasil = "Selamat Kamu Berhasil ! :-)";
        }
        else{
            hasil = "Maaf Kamu Belum Berhasil ! :-(";
        }

        JOptionPane.showMessageDialog(null, "Nilai Rata - Rata Anda : " + avg);
        JOptionPane.showMessageDialog(null, hasil);
    }
}
