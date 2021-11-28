package Service;

import dao.SeatMapper;
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

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.selectStudent();

        User1Mapper mapper1 = session.getMapper(User1Mapper.class);
        List<User1> user1List = mapper1.selectUser();

        SeatMapper mapper2 = session.getMapper(SeatMapper.class);

        for(Student s:studentList){
            System.out.println(s.getName());
        }

        for(User1 u: user1List){
            System.out.println(u.getUserName());
        }



        session.close();

    }
}
