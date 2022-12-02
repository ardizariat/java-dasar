public class Scope {
    /*
    di java, variable hanya bisa diakses didalam area dimana variable itu dibuat -> hal itu namanya scope
     */

    public static void main(String[] args) {
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello "+name;
        if(!name.isBlank()){
            String hi = "Hi "+name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
