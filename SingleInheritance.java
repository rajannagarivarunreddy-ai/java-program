class phone {
    void call() {
        System.out.println("Calling..");
    }
}
class SmartPhone extends phone {
    void browse() {
        System.out.println("Browsing internet...");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.browse();
    }
}