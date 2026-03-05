package LoanApproval;

public class LoanProcessor {
    public static boolean checkApproval(LoanApplication app, LoanApproval rule){
        return rule.isApproved(app);
    }
}
