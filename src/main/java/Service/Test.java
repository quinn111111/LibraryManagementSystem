package Service;

import Entity.Order;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws ParseException {

        Map<String, String> SeatIdMap = new HashMap<>();
        SeatIdMap.put("A101","disabled");
        SeatIdMap.put("A102","disabled");
        System.out.println(SeatIdMap.get("A103"));

        String SeatId = "1A101";
        String SeatId1 = SeatId.substring(1,5);
        System.out.println(SeatId1);
    }
}
