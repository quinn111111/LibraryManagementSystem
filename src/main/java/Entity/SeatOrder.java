package Entity;

public class SeatOrder {
    private String OrderId;
    private String VerifyCode;
    private String Floor;
    private String OrderDate;
    private String EndTime;
    private String BeginTime;
    private String SeatId;
    private String UserId;


    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getVerifyCode() {
        return VerifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        VerifyCode = verifyCode;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getSeatId() {
        return SeatId;
    }

    public void setSeatId(String seatId) {
        SeatId = seatId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }


    @Override
    public String toString() {
        return "SeatOrder{" +
                "OrderId='" + OrderId + '\'' +
                ", VerifyCode='" + VerifyCode + '\'' +
                ", Floor='" + Floor + '\'' +
                ", OrderDate='" + OrderDate + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", BeginTime='" + BeginTime + '\'' +
                ", SeatId='" + SeatId + '\'' +
                ", UserId='" + UserId + '\'' +
                '}';
    }
}
