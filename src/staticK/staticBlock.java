package staticK;

public class staticBlock {

    static {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("I m in main method");
    }

    static {
        System.out.println("Bonjour");
    }
}



// We can create multiple static blocks in one class.

//Uses:1)Static block is executed at class loading,
// hence at the time of class loading if we want to perform any activity,
//we have to define that inside static block.
//2) we uses native methods to load within static methods.
//3)static block is used to initialize the static members.