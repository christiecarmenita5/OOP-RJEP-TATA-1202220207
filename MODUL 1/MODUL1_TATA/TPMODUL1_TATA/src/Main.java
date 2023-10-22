// Class Main
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek bank
        Bank bank = new Bank();

        // Menambahkan 3 akun ke bank
        Account account1 = new Account("Aldean_SI4607", "1202200777", 100000);
        Account account2 = new Account("Tegar_SI4608", "1202200888", 200000);
        Account account3 = new Account("Gemilang_SI4609", "1202200999", 300000);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Menampilkan saldo awal semua akun
        System.out.println("Saldo Akun Aldean: " + account1.getBalance());
        System.out.println("Saldo Akun Tegar: " + account2.getBalance());
        System.out.println("Saldo Akun Gemilang: " + account3.getBalance());

        // Mensetor uang ke akun Aldean
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang yang ingin disetor ke akun Aldean: ");
        double amount = scanner.nextDouble();
        account1.deposit(amount);

        // Menampilkan saldo akun Aldean setelah menyetor
        System.out.println("Saldo Akun Aldean setelah menyetor: " + account1.getBalance());

        // Menarik uang dari akun Tegar
        System.out.println("Masukkan jumlah uang yang ingin ditarik dari akun Tegar: ");
        amount = scanner.nextDouble();
        boolean success = account2.withdraw(amount);

        // Menampilkan saldo akun Tegar setelah menarik uang
        if (success) {
            System.out.println("Suskes");
        }
    }
}