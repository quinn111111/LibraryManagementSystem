package Service;

import Entity.SeatOrder;
import Utils.MybatisUtils;
import dao.SeatOrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        SqlSession session = MybatisUtils.getSession();
        SeatOrderMapper seatOrderMapper = session.getMapper(SeatOrderMapper.class);

        List<SeatOrder> seatOrders = seatOrderMapper.findOrderByUserId("1");
        System.out.println(seatOrders);
    }
}
