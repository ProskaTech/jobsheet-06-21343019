/*
 * Created_by_21343019_Arafil Azmi
 */

public class Grade {
    public static void main(String[] args) {
        double grade = 92.0;

        if (grade >= 90){
            System.out.println("Excellent!");
        }
        /* untuk menentukan kondisi yang memounyai nilai rentangan maka tentukan nilai 
           batas atas dan bawah setelah itu digabungkan ]
         * dengan logika AND (&&) */

        else if((grade < 90) && (grade >= 80)) { // 80 s.d 89
            System.out.println("Good Job!");
        }
        else if((grade < 80) && (grade >= 60)) { // 80 s.d 89
            System.out.println("Study Harder!");
        }
        else  { 
            System.out.println("Sorry, you failed.");
        }
    }
}
