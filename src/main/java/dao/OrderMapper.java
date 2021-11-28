package dao;

import Entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    List<Order> selectAllColumns();

    Order findOrderById(String OrderId);

    Order findOrderById2(String OrderId);

    List<Order> findOrderByUserId(String UserId);

    List<Order> findOrderBySeatId(String SeatId);

    void addOrder(Order order);

    void deleteOrder(String OrderId);

    void updateOrder(Order order);

    List<Order> findOrdersByConditions(Order order);

    Map<String,Object> findOrderMap(Order order);

    List<Order> findOrderByTime(Order order);
}
