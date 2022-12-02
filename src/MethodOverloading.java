public class MethodOverloading {
    /*
    method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
    namun ada autrannya, yaitu parameternya harus berbeda. baik itu tipe datanya yang berbeda atau jumlah
    parameternya. jika sama maka akan error
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("ardi");
        sayHello("ardi","dzariat");
    }

    static void sayHello(){
        System.out.println("hello tanpa parameter");
    }

    static void sayHello(String name){
        System.out.println("hello "+name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("hello "+firstName + " "+lastName);
    }
}
