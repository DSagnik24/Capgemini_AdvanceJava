package LoanApproval;

import java.util.ArrayList;

public class Impl {
    public static void main(String[] args) {
        LoanApplication application =
                new LoanApplication(60000, 720, 36000);

       LoanApproval credit  = a ->a.getCreditScore()>=700;

       LoanApproval income = a->a.getIncome() >= 50000;

       LoanApproval safeBorrow = a->a.getAmountRequested() <= a.getIncome()*0.30;

        System.out.println(LoanProcessor.checkApproval(application,credit));

        System.out.println(LoanProcessor.checkApproval(application,income));

        System.out.println(LoanProcessor.checkApproval(application,safeBorrow));
    }
}
