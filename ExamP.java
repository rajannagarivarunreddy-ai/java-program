public class ExamP {
    public static void main(String[] args) {

        // Locker status: true = occupied, false = available
        boolean[] lockerStatus = {
            false, true, false, true, false,
            false, true, false, true, false
        };

        // Display locker numbers and their status
        for (int i = 0; i < 10; i++) {
            System.out.println("Locker " + (i + 1) + " : "
                    + (lockerStatus[i] ? "Occupied" : "Available"));
        }
    }
}