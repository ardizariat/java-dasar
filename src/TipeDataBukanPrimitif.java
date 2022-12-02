public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10_000L;
        Byte iniByte = null;

        System.out.println(iniByte);

//        konversi tipe data primitif
        int age = 20;
        Integer ageObject = age;

        short shortAge = ageObject.shortValue();
        long longAge = ageObject.longValue();

        Long amount = 1_000_000L;
        amount.floatValue();
        System.out.println(amount);
    }
}
