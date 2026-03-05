package M1.LoanApproval;
@FunctionalInterface
public interface LoanApprovalRule {
    boolean approve(LoanApplication app);
}
