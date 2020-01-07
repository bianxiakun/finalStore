package com.bxk.finalstore;

import com.bxk.entity.User;
import com.bxk.finalstore.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService iUserService;
    @Test
    public void login(){
        User user = iUserService.login("1","bxk");
        System.out.println(user);
    }
}
