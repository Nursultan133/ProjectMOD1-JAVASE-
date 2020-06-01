public class Database {
    public static BankAccount allAccounts[]  = new BankAccount[10];
    static {
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",20000,"KZ010322312", "0102");
        allAccounts[1] = new CityBankAccount("Zhanna","Bektursyn",95000,"KZ231561035","1212");
        allAccounts[2] = new NationalBankAccount("Aidos Nokerbai",35000,"KZ134613165","3621");
        allAccounts[3] = new CityBankAccount("Akezhan","Birzhanov",28000,"KZ010322312", "0813");
        allAccounts[4] = new CityBankAccount("Erbol","Assanbek",56000,"KZ286465465","0064");
        allAccounts[5] = new NationalBankAccount("Ilyas Zhuanyshev",27000,"KZ135531894","7421");
        allAccounts[6] = new CityBankAccount("Tilek","Tabitov",15000,"KZ010322312", "0702");
        allAccounts[7] = new CityBankAccount("Aidyn","Kuwanbai",80000,"KZ23v891033","1412");
        allAccounts[8] = new NationalBankAccount("Jandos Dosymjan",25000,"KZ135531894","8874");
        allAccounts[9] = new NationalBankAccount("Almas Nurakyn",44000,"KZ645316845","5586");
    }
}
