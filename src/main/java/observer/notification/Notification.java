package observer.notification;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import observer.order.Order;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Notification implements Observer{
    String notificationType;

    public void update(Order order){
        System.out.println(Notification.class + " - Order number: "
                + order.getOrderNumber() + " changed its status to: " + order.getOrderStatus());
    }
}
