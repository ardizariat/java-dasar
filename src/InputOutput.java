import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class InputOutput {
    public static void main(String[] args) {
//        String nama, alamat;
        String a, b, operator;
        int c = 0;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Kalkulator ###");
        System.out.print("Angka pertama: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        a = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Angka kedua: ");
        // menggunakan scanner lagi
        b = keyboard.nextLine();

        System.out.print("Operator: ");
        operator = keyboard.nextLine();
//        operator = keyboard.nextInt();
        if (operator.equals("+")){
            c = parseInt(a) + parseInt(b);
        }
        else if (operator.equals("-")) {
            c = parseInt(a) - parseInt(b);
        }else if (operator.equals("*")) {
            c = parseInt(a) * parseInt(b);
        }else if (operator.equals("/")) {
            c = parseInt(a) / parseInt(b);
        }

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Angka pertama: " + a);
        System.out.println("Angka kedua: " + b);
        System.out.println("operator: " + operator);
        System.out.println("hasilnya: " + c);
    }
}
