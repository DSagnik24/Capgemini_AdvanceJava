package M1.LoanApproval;

public class Solution {
    public static void main(String[] args) {
    LoanApplication app = new LoanApplication(60000, 720, 15000);

    LoanApprovalRule getCredit = p -> {
        if (p.getCreditScore() >= 700) {
            System.out.println("Credit Score Rule: Approved");
            return true;
        } else {
            System.out.println("Credit Score Rule: Not Approved");
            return false;
        }
    };

    LoanApprovalRule getIncome = p -> {
        if (p.getIncome() > 50000) {
            System.out.println("Income Rule: Approved");
            return true;
        } else {
            System.out.println("Income Rule: Not Approved");
            return false;
        }
    };

    LoanApprovalRule getAmout = p -> {
        if (p.getLoanAmount() <= p.getIncome() * 0.3) {
            System.out.println("Safe Borrow Rule: Accepted");
            return true;
        } else {
            System.out.println("Safe Borrow Rule: Rejected");
            return false;
        }
    };

    getCredit.approve(app);
    getIncome.approve(app);
    getAmout.approve(app);

}
}
