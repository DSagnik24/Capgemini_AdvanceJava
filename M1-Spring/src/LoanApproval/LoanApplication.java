package LoanApproval;

public class LoanApplication {

    private double income;
    private int creditScore;
    private double amountRequested;

    public LoanApplication(double income, int creditScore, double amountRequested) {
        this.income = income;
        this.creditScore = creditScore;
        this.amountRequested = amountRequested;
    }

    public double getIncome() {
        return income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getAmountRequested() {
        return amountRequested;
    }
}