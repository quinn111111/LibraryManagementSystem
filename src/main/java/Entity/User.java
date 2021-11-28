package Entity;

public class User {
    String UserId;
    String UserName;
    String Password;
    String Permission;
    String Balance;
    String BreachNum;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPermission() {
        return Permission;
    }

    public void setPermission(String permission) {
        Permission = permission;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getBreachNum() {
        return BreachNum;
    }

    public void setBreachNum(String breachNum) {
        BreachNum = breachNum;
    }
}