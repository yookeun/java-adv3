package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import optional.model.Delivery;
import optional.model.Order;

public class DeliveryMain {
    static Map<Long, Order> orderReository = new HashMap<>();

    static {
        orderReository.put(1L, new Order(1L, new Delivery("배송완료", false)));
        orderReository.put(2L, new Order(2L, new Delivery("배송중", false)));
        orderReository.put(3L, new Order(3L, new Delivery("배송중", true)));
        orderReository.put(4L, new Order(4L, new Delivery("배송준비중", false)));
    }

    public static void main(String[] args) {
        System.out.println("1번 주문의 배송 상태 : " + getDeliveryStatus(1L));
        System.out.println("2번 주문의 배송 상태 : " + getDeliveryStatus(2L));
        System.out.println("3번 주문의 배송 상태 : " + getDeliveryStatus(3L));
    }

    private static String getDeliveryStatus(long orderId) {
        return findOrder(orderId)
                .map( Order::getDelivery)
                .filter(delivery -> !delivery.isCanceled())
                .map(Delivery::getStatus)
                .orElse("배송X"); //값이 없으면 배송 X
    }

    static Optional<Order> findOrder(Long orderId) {
        return Optional.ofNullable(orderReository.get(orderId));
    }
}
