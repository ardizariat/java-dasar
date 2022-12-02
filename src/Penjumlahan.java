import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Penjumlahan {
    public static void main(String[] args) {
        String a = "10.22";
        String b = "20.4";
        float c;
        try{
            c = parseFloat(a) + parseFloat(b);
            System.out.print(c);
        }catch (NumberFormatException e) {
            c = 0;
        }



    }
}
