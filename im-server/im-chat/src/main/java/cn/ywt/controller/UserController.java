package cn.ywt.controller;

import cn.ywt.entity.User;
import cn.ywt.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/findAll")
    public List<User> findAll(){

        List<User> users = userMapper.selectList(null);
        for(User user:users){
            System.out.println(user);
        }
        return users;
    }

}
