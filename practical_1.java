import java.util.*;

class BankSystem {
    private String bankName;
    private String branchName;
    private String ifscCode;

    public BankSystem(String bankName, String branchName, String ifscCode) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
    }

    public void input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        String bankName = sc.next();

        System.out.print("Enter Branch Name: ");
        String branchName = sc.next();

        System.out.print("Enter ifsCode: ");
        String ifsCode = sc.next();

        
    }
}


public class practical_1 {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem("ABC Bank", "Main Branch", "ABC123456");
        bank.input();
      
        bank.displayBankDetails();


    }
}
