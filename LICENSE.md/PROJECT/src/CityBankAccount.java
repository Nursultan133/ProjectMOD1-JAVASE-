public class CityBankAccount implements BankAccount{
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(){}

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance = getBalance()-credit;
        System.out.println("Take the money!"+"\n");
    }

    @Override
    public void debetBalance(int debet) {
        balance = getBalance()+debet;
        System.out.println("successfull cashed!"+"\n");
    }

    @Override
    public String accountData() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

}
