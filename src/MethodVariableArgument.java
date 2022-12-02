public class MethodVariableArgument {
    public static void main(String[] args) {
//        method tanpa argument
        int[] nilai = {100,94,95,56};
        sayCongratsWithoutArgument("ardi","matematika",nilai);

//        method dengan menggunakan argument
        sayCongratsWithArgument("ardi","bahasa inggris", 44,12,67,56,90);
    }

    static void sayCongratsWithoutArgument(String name,String course, int[] values){
        var total = 0;
        for(var value : values){
            total += value;
        }
//        rata-rata nilai
        var finalValue = total / values.length;
        if(finalValue >= 75)
            System.out.println("Selamat "+name+ " kelas "+course+" anda lulus");
        else
            System.out.println("Maaf "+name+ " kelas "+course+" anda tidak lulus");
    }

    static void sayCongratsWithArgument(String name,String course, int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }
        var finalTotal = total / values.length;

        if(finalTotal >= 75)
            System.out.println("Selamat "+name+ " kelas "+course+" anda lulus");
        else
            System.out.println("Maaf "+name+ " kelas "+course+" anda tidak lulus");
    }
}
