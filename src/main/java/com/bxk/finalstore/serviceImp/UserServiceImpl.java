package com.bxk.finalstore.serviceImp;

import com.bxk.entity.User;
import com.bxk.finalstore.mapper.UserMapper;
import com.bxk.finalstore.service.IUserService;
import com.bxk.finalstore.service.ex.PasswordNotMatchException;
import com.bxk.finalstore.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     * @throws UserNotFoundException
     * @throws PasswordNotMatchException
     */
    @Override
    public User login(String username, String password) throws UserNotFoundException, PasswordNotMatchException {
        User user = findByUsername(username);
        if(user!=null){
            String salt = user.getSalt();
            String newPassword = getMd5Password(password,salt);
            if(newPassword.equals(user.getPassword())){
                if(user.getIsDelete()==0){
                    user.setPassword(null);
                    user.setSalt(null);
                    return user;
                }else{
                    throw new UserNotFoundException("该用户不存在");
                }
            }else{
                throw new PasswordNotMatchException("密码不正确，请确认后重新输入");
            }
        }else{
            throw new UserNotFoundException("该用户不存在");
        }
    }

    /**
     * MD5加密
     * @param srcPassword
     * @param salt
     * @return
     */
    private String getMd5Password(String srcPassword,String salt){
        String firstPassword = salt+srcPassword+salt;
        for (int i = 0; i < 9; i++) {
            firstPassword = DigestUtils.md5DigestAsHex(firstPassword.getBytes());
        }
        return firstPassword;
    }
    /**
     * 封装Mapper的根据用户名查询信息的方法
     * @param username
     * @return
     */
    private User findByUsername(String username){
        return userMapper.findByUsername(username);
    }
}
