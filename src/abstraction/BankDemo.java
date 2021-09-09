package abstraction;

public abstract class BankDemo {
    public abstract void bank();
    public void rbi(){
        System.out.println("Minimum balance should be 500rs");
    }
}

class HDFC extends BankDemo{

    @Override
    public void bank() {
        System.out.println("Welcome to HDFC Bank,age proof is needed for a/c opening");
    }

    public static void main(String[] args) {
        HDFC h = new HDFC();
        h.bank();
    }
}

class Kotak extends BankDemo{

    @Override
    public void bank() {
        System.out.println("Welcome to Kotak Bank, 0 balance a/c can be created,KYC required");
    }

    public static void main(String[] args) {
        Kotak k = new Kotak();
        k.bank();
    }
}

class SBI extends BankDemo{

    @Override
    public void bank() {
        System.out.println("Welcome to SBI Bank,KYC required for opening current a/c");
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        s.bank();
        s.rbi();
    }
}

