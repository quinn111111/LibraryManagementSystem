package Service;

import Entity.Seat;
import dao.SeatMapper;
import dao.UserMapper;

import Entity.User;

import Utils.MybatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.Map;

public class MyTest2 {

    @Test
    public void selectSeat(){
        SqlSession session = MybatisUtils.getSession();

        SeatMapper mapper = session.getMapper(SeatMapper.class);


/*        int i = 6;
        for(int j=1;j<=6;j++)
        {
            for(int k=1;k<=9;k++)
            {
                String seatId = i+"B"+j+"0"+k;
                String position = i+"楼B区"+j+"排0"+k+"座";
                String status = "空闲";
                Seat seat = new Seat();
                seat.setSeatId(seatId);
                seat.setSeatPosition(position);
                seat.setSeatStatus(status);
                mapper.addSeat(seat);
            }
        }*/




        session.commit();
        session.close();
    }
}
