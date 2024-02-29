package cn.ywt;


import cn.ywt.entity.User;
import cn.ywt.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class crudTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUserId(9999L);
        user.setUserName("abc");
        user.setSex("male");
        user.setPassword("123456");
        userMapper.insert(user);
    }

    @Test
    public void findById(){
        User user = userMapper.selectById(1004L);
        System.out.println(user);
    }
    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        for(User user:users){
            System.out.println(user);
        }
    }
}
