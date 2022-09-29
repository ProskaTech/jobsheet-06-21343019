package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
*/

import java.util.Scanner;

public class Tugas2A {
    public static void main(String[] args) {

        Scanner dataIn = new Scanner (System.in);

        int inputan;

        System.out.print("Masukan Angka : ");
        inputan = dataIn.nextInt();

        if (inputan == 1){
            System.out.println("Satu !");
        }
        else if (inputan == 2) {
            System.out.println("Dua !");
        }
        else if (inputan == 3) {
            System.out.println("Tiga !");
        }
        else if (inputan == 4){ 
            System.out.println("Empat !");
        }
        else if (inputan == 5) {
            System.out.println("Lima !");
        }
        else if (inputan == 6) {
            System.out.println("Enam !");
        }
        else if (inputan == 7){ 
            System.out.println("Tujuh !");
        }
        else if (inputan == 8) {
            System.out.println("Delapan !");
        }
        else if (inputan == 9) {
            System.out.println("Sembilan !");
        }
        else if (inputan == 10){ 
            System.out.println("Sepuluh !");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
