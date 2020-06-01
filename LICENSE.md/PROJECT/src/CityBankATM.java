import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Insert account number:");
        String acn = in.next();
        System.out.print("Inert password:");
        String pin = in.next();

        for(int i = 0;i<Database.allAccounts.length;i++){
            if(acn.equals(Database.allAccounts[i].getAccountNumber())&&pin.equals(Database.allAccounts[i].getPinCode())
            &&Database.allAccounts[i] instanceof CityBankAccount){
                while (true){
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL"+"\n"+"PRESS [2] TO VIEW BALANCE"+"\n"+
                            "PRESS [3] TO CHANGE PIN CODE"+"\n"+"PRESS [4] TO CASH IN ACCOUNT"+"\n"+
                            "PRESS [5] TO VIEW ACCOUNT DATA"+"\n"+"PRESS [6] TO EXIT");
                    int ch = in.nextInt();
                    if(ch==1){
                        System.out.print("Insert amount of money you need:");
                        int ins = in.nextInt();
                        Database.allAccounts[i].creditBalance(ins);
                    }else if(ch==2){
                        System.out.println(Database.allAccounts[i].totalBalance());
                    }else if(ch==3){
                        System.out.print("Insert new pincode:");
                        String np = in.next();
                        Database.allAccounts[i].setPinCode(np);
                    }else if(ch==4){
                        System.out.print("Insert amount of money to cash:");
                        int cash = in.nextInt();
                        Database.allAccounts[i].debetBalance(cash);
                    }else if(ch==5){
                        System.out.println(Database.allAccounts[i].accountData());
                    }else if(ch==6){
                        break;
                    }
                }
            }else if(acn.equals(Database.allAccounts[i].getAccountNumber())&&pin.equals(Database.allAccounts[i].getPinCode())&&
            Database.allAccounts[i] instanceof NationalBankAccount){
                while (true){
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL"+"\n"+"PRESS [2] TO VIEW BALANCE"+"\n"+"PRESS [3] TO EXIT");
                    int ch = in.nextInt();
                    if(ch==1) {
                        System.out.print("Insert amount of money you need(comission 200):");
                        int ins = in.nextInt();
                        Database.allAccounts[i].creditBalance(ins);
                        Database.allAccounts[i].setBalance(Database.allAccounts[i].totalBalance()-200);
                    }else if(ch==2){
                        System.out.println(Database.allAccounts[i].totalBalance());
                    }else if(ch==3){
                        break;
                    }
                }
            }
        }
    }
}
