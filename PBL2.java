class Locker {
    String name;
    int ID;
    String branch;
    String size;
    Locker(String name, int ID, String branch, String size) {
        this.name = name;
        this.ID = ID;
        this.branch = branch;
        this.size = size;
    }
    void display() {
        System.out.println("Enter the name: " + name);
        System.out.println("Enter ID: " + ID);
        System.out.println("Enter branch: " + branch);
        System.out.println("Enter size of parcel: " + size);
    }
}
public class PBL2 {
    public static void main(String[] args) {
        Locker L = new Locker(
            "Varun",
            634,
            "CSE",
            "Large"
        );
        L.display();
        System.out.println();
    }
}