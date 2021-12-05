package Service;

import Entity.SeatOrder;
import dao.SeatMapper;
import dao.SeatOrderMapper;
import dao.StudentMapper;
import dao.User1Mapper;
import Entity.Student;
import Entity.User1;
import Utils.MybatisUtils;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MyTest {
    private ResultHandler HttpController;

    @Test
    public void selectStudent() throws IOException {
        SqlSession session = MybatisUtils.getSession();

        SeatOrderMapper mapper = session.getMapper(SeatOrderMapper.class);
        List<SeatOrder> seatOrderList = mapper.findOrderByUserId("1");
        for(SeatOrder seatOrder : seatOrderList){
            System.out.println(seatOrder);
        }
        session.close();

    }
}
