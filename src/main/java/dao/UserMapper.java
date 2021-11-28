package dao;

import Entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> selectAllColumns();

    User findUserById(String userId);
    User findUserById2(String userId);

    List<User> findUserByName(String userName);

    int addUser(User user);

    int deleteUserById(String userId);

    int updateUser(User user);

    List<User> findUsersByConditions(User user);


    Map<String,Object> findUserMap(User user);


}
