package com.bxk.finalstore;

import com.bxk.entity.User;
import com.bxk.finalstore.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class mapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void login(){
        User user = userMapper.findByUsername("1");
        System.out.println(user);
    }


}
