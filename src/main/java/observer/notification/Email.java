package observer.notification;

import observer.order.Order;

public class Email implements Observer {
    public void update(Order order){
        System.out.println("email - Order number: " + order.getOrderNumber() + " changed its status to: " + order.getOrderStatus());
    }
}
