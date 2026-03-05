package SmartLogisticsOrderProcessing;

public class OrderSummary {
    private int id;
    private String customerName;
    private String status;
    private double amount;

    public OrderSummary(int id, String customerName, String status, double amount) {
        this.id = id;
        this.customerName = customerName;
        this.status = status;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderSummary{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
