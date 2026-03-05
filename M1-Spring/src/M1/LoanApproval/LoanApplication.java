package M1.LoanApproval;

public class LoanApplication {
    double income;
    int creditScore;
    double loanAmount;

    public LoanApplication(double income, int creditScore, double loanAmount){
        this.income = income;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
    }

    public double getIncome() {
        return income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
