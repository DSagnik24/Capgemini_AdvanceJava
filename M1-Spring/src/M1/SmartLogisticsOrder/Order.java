package M1.SmartLogisticsOrder;

public class Order {

    private int orderId;
    private String customerName;
    private String city;
    private double amount;
    private String status;
    private String date;

    public Order(int orderId, String customerName, String city,
                 double amount, String status, String date) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.city = city;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCity() {
        return city;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return orderId + " | " + customerName + " | " + city +
                " | " + amount + " | " + status + " | " + date;
    }

}
