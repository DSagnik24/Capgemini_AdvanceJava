package LoanApproval;

@FunctionalInterface
public interface LoanApproval {
   boolean isApproved(LoanApplication la);
}
