import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        for (Account account : this.accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(account);
                break;
            }
        }
    }

    public Account getAccount(String accountNumber) {
        for (Account account : this.accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

}