package SmartLogisticsOrderProcessing;

import java.time.LocalDate;


public class Order {
    private int OrderId;
    private String customerName;
    private String DeliveryLocation;
    private double orderAmount;
    private String status;
    private LocalDate date;

    public Order(int orderId, String customerName, String deliveryLocation, double orderAmount, String status, LocalDate date) {
        this.OrderId = orderId;
        this.customerName = customerName;
        DeliveryLocation = deliveryLocation;
        this.orderAmount = orderAmount;
        this.status = status;
        this.date = date;
    }

    public int getOrderId() {
        return OrderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeliveryLocation() {
        return DeliveryLocation;
    }

    public  double getOrderAmount() {
        return orderAmount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId=" + OrderId +
                ", customerName='" + customerName + '\'' +
                ", DeliveryLocation='" + DeliveryLocation + '\'' +
                ", orderAmount=" + orderAmount +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
