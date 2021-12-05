package Controllers;

import Entity.SeatOrder;
import Utils.MybatisUtils;
import dao.SeatOrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class OrderController {
    @RequestMapping("/OrderIndex")
    public ModelAndView SeatOrder() throws ParseException {
        ModelAndView mav = new ModelAndView("OrderIndex");
/*        SqlSession session = MybatisUtils.getSession();
        SeatOrderMapper orderMapper = session.getMapper(SeatOrderMapper.class);
        List<SeatOrder> orderList = orderMapper.findOrderByUserId("1");*/

        /*
        SqlSession session = MybatisUtils.getSession();
        SeatOrderMapper seatOrderMapper = session.getMapper(SeatOrderMapper.class);

        List<SeatOrder> seatOrders = seatOrderMapper.findOrderByUserId("1");

        System.out.println(1111);
        if(seatOrders!=null){
            SeatOrder seatOrder = seatOrders.get(0);
            String floor = seatOrder.getFloor();
            String seatId = seatOrder.getSeatId();
            seatOrder.setSeatId(seatOrder.getSeatId().substring(1,5));


            SimpleDateFormat myFormatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
            Date date= myFormatter.parse(seatOrder.getOrderDate()+" "+seatOrder.getBeginTime());
            Date mydate= new Date();


            long ms = date.getTime()-mydate.getTime();

            System.out.println( "相差的日期: "+ms);

            long day = ms/(24*60*60*1000);
            ms = ms%(24*60*60*1000);
            long hour = ms/(60*60*1000);
            ms = ms%(60*60*1000);
            long minute = ms/(60*1000);


            mav.addObject("day",day);
            mav.addObject("hour",hour);
            mav.addObject("minute",minute);
            mav.addObject("flag",true);
            mav.addObject("floor",floor);
            mav.addObject("seatId",seatId);
        }
*/


        return mav;
    }

/*
    @ModelAttribute("OrderItem")
    public Map<String,SeatOrder> getItem(SeatOrder seatOrder)throws Exception{
        HashMap<String,SeatOrder> OrderItem= new HashMap<String, SeatOrder>();
        OrderItem.put("seatOrder",seatOrder);
        return OrderItem;
    }*/

    @RequestMapping("/SeatShow")
    public ModelAndView SeatShow(SeatOrder seatOrder) throws Exception {
        ModelAndView mav = new ModelAndView("SeatShow");
        SqlSession session = MybatisUtils.getSession();

        System.out.println(seatOrder.getOrderDate());
        System.out.println(seatOrder.getBeginTime());
        System.out.println(seatOrder.getEndTime());
        System.out.println(seatOrder.getFloor());

        SeatOrderMapper orderMapper = session.getMapper(SeatOrderMapper.class);

        List<SeatOrder> orderList = orderMapper.findOrderByTime(seatOrder);

        Map<String, String> SeatIdMap = new HashMap<>();
        for(SeatOrder order1:orderList){
            String SeatId = order1.getSeatId();
            String SeatId1 = SeatId.substring(1,5);
            SeatIdMap.put(SeatId1,"disabled");
        }

        mav.addObject("SeatIdMap",SeatIdMap);
        mav.addObject("seatOrder",seatOrder);

        return mav;
    }



    @RequestMapping("/SeatOrder")
    public ModelAndView SeatOrder(SeatOrder seatOrder) {


        Date date = new Date();
        seatOrder.setOrderId(Long.toString(date.getTime()));
        seatOrder.setVerifyCode(Integer.toString((int)((Math.random()*9+1)*100000)));

        seatOrder.setUserId("1");
        seatOrder.setSeatId(seatOrder.getFloor()+seatOrder.getSeatId());

        System.out.println(seatOrder.getSeatId());
        System.out.println(seatOrder.getOrderDate());
        System.out.println(seatOrder.getBeginTime());
        System.out.println(seatOrder.getEndTime());


        SqlSession session = MybatisUtils.getSession();
        SeatOrderMapper mapper = session.getMapper(SeatOrderMapper.class);
        mapper.addOrder(seatOrder);
        session.commit();
        session.close();

        ModelAndView  model = new ModelAndView("/FirmPage");
        model.addObject("seatOrder",seatOrder);
        return model;
    }
    @RequestMapping("/Rules")
    public ModelAndView Rules(SeatOrder seatOrder){
        System.out.println(seatOrder.getOrderId());
        return new ModelAndView("/Rules");
    }
}
