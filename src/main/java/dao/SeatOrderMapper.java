package dao;

import Entity.Seat;
import Entity.SeatOrder;

import java.util.List;
import java.util.Map;

public interface SeatOrderMapper {

    List<SeatOrder> selectAllColumns();

    List<SeatOrder> findOrderByTime(SeatOrder seatOrder);

    List<SeatOrder> findOrderByUserId(String UserId);

    void addOrder(SeatOrder seatOrder);


    void deleteOrderById(String OrderId);


    void updateOrder(SeatOrder seatOrder);

    List<SeatOrder> findOrdersByConditions(SeatOrder order);

    Map<String,Object>  findOrderMap(SeatOrder order);

}
