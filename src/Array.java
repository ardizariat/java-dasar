public class Array {
    public static void main(String[] args) {
//        cara pertama buat array dengan inisialisasi dulu arraynya
//        inisialisasi array
        String[] stringArray;
//        inisialisasi banyaknya array, karena length array di java harus tetap
        stringArray = new String[3];
//        push data ke array
        stringArray[0] = "ardi";
        stringArray[1] = "nor";
        stringArray[2] = "dzariat";
//         get data dalam array
        var namaPertama = stringArray[0];
        System.out.println(namaPertama);

//        cara kedua membuat array
        int[] arrayInt = new int[]{
                1,2,6,8,
        };
        System.out.println(arrayInt[1]);

//        cara ketiga membuat array
        String[] namaUser = {
                "yudi", "eko","lesmana"
        };
        System.out.println(namaUser[1]);

//        menghitung panjang array
        System.out.println("jumlah array namaUser ada : " + namaUser.length);
//        mengubah data didalam array
        namaUser[1] = "eko edit";
        System.out.println(namaUser[1]);
    }
}
