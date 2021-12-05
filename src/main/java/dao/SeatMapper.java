package dao;

import Entity.Seat;
import Entity.SeatOrder;

import java.util.List;
import java.util.Map;

public interface SeatMapper {

    List<Seat> selectAllColumns();

    Seat findSeatById(String SeatId);
    Seat findSeatById2(String SeatId);


    Seat findSeatBySeatPosition(String SeatPosition);

    void addSeat(Seat seat);

    void deleteSeatById(String SeatId);

    void updateSeat(Seat seat);

    List<Seat> findSeatsByConditions(Seat seat);

    Map<String,Object> findSeatMap(Seat seat);

    Seat findSeatByOrder(SeatOrder seatOrder);
}
