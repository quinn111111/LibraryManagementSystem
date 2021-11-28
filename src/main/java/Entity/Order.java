package Entity;

public class Order {
    String OrderId;
    String VerifyCode;
    String OrderDate;
    String BeginTime;
    String EndTime;
    String UserId;
    String SeatId;
    String Floor;

    @Override
    public String toString() {
        return "Order{" +
                "OrderId='" + OrderId + '\'' +
                ", VerifyCode='" + VerifyCode + '\'' +
                ", OrderDate='" + OrderDate + '\'' +
                ", BeginTime='" + BeginTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", UserId='" + UserId + '\'' +
                ", SeatId='" + SeatId + '\'' +
                ", Floor='" + Floor + '\'' +
                '}';
    }

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

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getSeatId() {
        return SeatId;
    }

    public void setSeatId(String seatId) {
        SeatId = seatId;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }
}
