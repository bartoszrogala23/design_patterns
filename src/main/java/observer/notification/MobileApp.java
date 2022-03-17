package observer.notification;

import observer.order.Order;

public class MobileApp implements Observer{
    public void update(Order order){
        System.out.println("mobile app - Order number: " + order.getOrderNumber() + " changed its status to: " + order.getOrderStatus());
    }
}
