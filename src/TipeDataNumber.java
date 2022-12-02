/**
 *  Tipe Data Number
 *  Type Data        Min                Max             Size        Default
 *  byte            -128                127             1 byte          0
 *  short           -32,768             32,767          2 bytes         0
 *  int             -2,147,483,648      2,147,483,647   4 bytes         0
 *  long            -9,223,372,036      9,223,372,036   8 bytes         0
 *                    854,775,808        854,775,807
 */


/**
 *  Tipe Data Float Number
 *  Type Data        Min                Max             Size        Default
 *  float            3.4e-038           3.4e+038        4 byte       0.0
 *  double           1.7e-308           1.7e-308        8 bytes      0.0
 */

public class TipeDataNumber {
    public static void main(String[] args) {

        // integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 2147483647;
        long iniLong = 1_000_000_000L;

        System.out.println("byte : "+iniByte);
        System.out.println("short : "+iniShort);
        System.out.println("int : "+iniInt);
        System.out.println("long : "+iniLong);

        // float
        float iniFloat = 10.23F;
        double iniDouble = 20.29;

        System.out.println("float : "+iniFloat);
        System.out.println("double : "+iniDouble);

        int decimalInt = 24;
//        penulisan hexadecimal didalam int diawali 0x
        int hexInt = 0xA13B;
//        penulisan binner diawali 0b
        int binInt = 0b010101010;
    }
}
