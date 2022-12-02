public class BreakAndContinue {
    /*
    Break => untuk menghentikan proses perulangan jika didalam loop
    Continue => menghentikan proses perulangan saat ini dan dilanjutkan perulangan berikutnya yang bersifat true
     */
    public static void main(String[] args) {
//        contoh break
        var counter = 1;
        while (true){
            System.out.println("perulangan ke "+ counter);
            counter++;
            if(counter > 5)
                break;
        }

//        contoh continue
        for(var counterContinue = 1; counterContinue <=10; counterContinue++){
            if(counterContinue % 2 == 0)
                continue;

            System.out.println("angka "+counterContinue + " adalah bilangan ganjil");
        }
    }
}
