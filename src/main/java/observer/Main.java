package observer;

import observer.notification.Email;
import observer.notification.MobileApp;
import observer.notification.TextMessage;
import observer.order.Order;
import observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(120L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        textMessage.updateOrderStatus(order);
        email.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);

        /*
          Two issues: redundand updateOrderStatus, too much actions needed if new orderStatus is changed (same if
          new notification type added)
         */
    }
}
