public class Method {
    /*
    Penamaan method biasayanya diawali huruf kecil, contoh sayHelloWorld()
    Secara default, method itu tidak menghasilkan value apapun, untuk bisa mengubah method yang dapat
    menghasilkan value caranya adalah mengubah kata kunci void menjadi tipe data yang ingin di return valuenya
    contohnya int, true
     */
    public static void main(String[] args) {
        sayHello("ardi");

        var nilai = sum(2,1);
        System.out.println("hasilnya "+ nilai);
    }

//    ini adalah contoh method / function dengan parameter
    static void sayHello(String name){
        System.out.println("hello "+name);
    }

    static int sum(int angka1, int angka2){
        return angka1 + angka2;
    }



}
