public class AccountTest {
    //Data Pengguna Bank
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.nama = "Ilham";
        account1.saldo = 10000.0;
        account1.bunga = 0.02;
        account1.cetak();

        SavingsAccount account2 = new SavingsAccount();
        account2.nama = "AUrel";
        account2.saldo = 20000.0;
        account2.cetak();
    }
}

