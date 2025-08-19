public class AccountTest {
    //Data Pengguna Bank
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.nama = "John Doe";
        account1.saldo = 1000.0;
        account1.bunga = 0.02;
        account1.cetak();

        SavingsAccount account2 = new SavingsAccount();
        account2.nama = "Jane Smith";
        account2.saldo = 2000.0;
        account2.cetak();
    }
}
