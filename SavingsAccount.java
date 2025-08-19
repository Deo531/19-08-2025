public class SavingsAccount {
    double saldo;
    double bunga = 0.02;
    String nama;
    public void cetak(){
        System.out.println("Nama Customer: " + nama);
        System.out.println("balance: " + saldo);
        System.out.println("interest rate: " + bunga);
        System.out.println("interest earned: " + (saldo * bunga));
        System.out.println();
    }
}

