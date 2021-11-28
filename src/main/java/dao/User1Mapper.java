package dao;

import Entity.User1;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface User1Mapper {
    @Select("select * from user")
    List<User1> selectUser();
}
