package observer.notification;

import observer.order.Order;

public class Email {
    public void updateOrderStatus(Order order){
        System.out.println("email - Order number: " + order.getOrderNumber() + " changed its status to: " + order.getOrderStatus());
    }
}
