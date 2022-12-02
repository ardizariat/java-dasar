public class Variable {
    /*
    variable adalah tempat untuk menyimpan data
    Java adalah bahasa static type, artinya variable hanya bisa digunakan untuk menyimpan tipe data yang sama
    dan tidak bisa berubah-ubah tipe data seperti PHP atau javascript
     */
    public static void main(String[] args) {
        String name;
        name = "ardi";

        int usia;
        usia = 99;

//        penulisan sederhana dalam variable
        var alamat = "jakarta";

//        penulisan variable yang tidak bisa diubah lagi (const) dalam java keywornya adalah final
        final var jenisKelamin = "laki-laki";

        System.out.println("nama "+name);
        System.out.println("usia "+usia);
        System.out.println("jenis kelamin "+jenisKelamin);
        System.out.println("alamat "+alamat);


    }
}
