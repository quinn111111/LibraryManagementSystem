package dao;
import Entity.UserInLib;

import java.util.List;

public interface UserInLibMapper {
    List<UserInLib> selectAllColumns();

    UserInLib findUserInLibById(String UserId);

    UserInLib findUserInLibById2(String UserId);

    void addUserInLib(UserInLib userInLib);

    void deleteUserInLibById(String UserId);

    void updateUserInLib(UserInLib userInLib);

}
