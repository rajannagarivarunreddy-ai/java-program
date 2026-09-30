class Account {
    int accountNo;
    double balance;
    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance : Rs. " + balance);
    }
    public static void main(String[] args) {
        Account ac = new Account();
        ac.accountNo = 101;
        ac.balance = 25000.50;
        ac.display();
    }
}