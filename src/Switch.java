public class Switch {
    public static void main(String[] args) {
        var nilai = "D";

        switch (nilai){
            case "A" -> System.out.println("Nilai anda sangat baik");
            case "B", "C" -> System.out.println("Nilai anda biasa saja");
            case "D" -> {
                System.out.println("Nilai anda sangat jelek");
            }
            default -> {
                System.out.println("Anda tidak punya nilai");
            }
        }

//        switch dengan yield tersedia di java versi 14 keatas
        var nilaiBudi = "A";
        String ucapan = switch (nilaiBudi){
            case "A":
                yield "Nilai anda sangat baik";
            case "B", "C":
                yield "Nilai anda biasa aja";
            case "D":
                yield "Nilai anda jelek";
            default:
                yield "Anda tidak ada nilai";
        };
        System.out.println("Nilai budi "+ ucapan);
    }
}
