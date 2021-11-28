package Controllers;

import Entity.Order;
import Entity.Seat;
import Utils.MybatisUtils;
import dao.OrderMapper;
import dao.SeatMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class OrderController {
    @RequestMapping("/OrderIndex")
    public ModelAndView SeatOrder() {

        SqlSession session = MybatisUtils.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);


        return new ModelAndView("OrderIndex");
    }


    @RequestMapping("/SeatShow")
    public ModelAndView SeatShow(Order order) {
        ModelAndView mav = new ModelAndView("SeatShow");
        SqlSession session = MybatisUtils.getSession();


        System.out.println(order.getOrderDate());
        System.out.println(order.getBeginTime());
        System.out.println(order.getEndTime());
        System.out.println(order.getFloor());



        OrderMapper orderMapper = session.getMapper(OrderMapper.class);


        List<Order> orderList = orderMapper.findOrderByTime(order);


        Map<String, String> SeatIdMap = new HashMap<>();
        for(Order order1:orderList){
            String SeatId = order1.getSeatId();
            String SeatId1 = SeatId.substring(1,5);
            SeatIdMap.put(SeatId1,"disabled");
        }

        mav.addObject("SeatIdMap",SeatIdMap);
/*
        SeatMapper seatMapper = session.getMapper(SeatMapper.class);
        List<Seat>seatList = new ArrayList<Seat>();
        for(Order order1:orderList){
            System.out.println(order1);
            Seat seat = seatMapper.findSeatByOrder(order1);
            seatList.add(seat);
            System.out.println(seat.getSeatPosition());
        }
*/

        mav.addObject("order",order);
/*        mav.addObject("seatList",seatList);*/

        return mav;
    }



    @RequestMapping("/SeatOrder")
    public ModelAndView SeatOrder(Order order) {


        System.out.println(order.getSeatId());
        System.out.println(order.getOrderDate());
        System.out.println(order.getBeginTime());
        System.out.println(order.getEndTime());


        Date date = new Date();
        order.setOrderId(Long.toString(date.getTime()));
        order.setVerifyCode(Integer.toString((int)((Math.random()*9+1)*100000)));

        order.setUserId("1");
        order.setSeatId(order.getFloor()+order.getSeatId());


        SqlSession session = MybatisUtils.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        mapper.addOrder(order);
        session.commit();
        session.close();

        ModelAndView  model = new ModelAndView("/Rules");
        model.addObject("Order",order);
        return model;
    }
    @RequestMapping("/Rules")
    public ModelAndView Rules(Order order){
        System.out.println(order.getOrderId());
        return new ModelAndView("/Rules");
    }
}
