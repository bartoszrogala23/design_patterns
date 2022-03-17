package observer.notification;

import observer.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order){
        System.out.println("SMS - Order number: " + order.getOrderNumber() + " changed its status to: " + order.getOrderStatus());
    }
}
