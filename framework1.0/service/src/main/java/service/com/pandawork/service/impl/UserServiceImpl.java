//package com.pandawork.service.impl;
//
//import com.pandawork.common.entity.User;
//import com.pandawork.common.utils.NFException;
//import com.pandawork.core.common.exception.SSException;
//import com.pandawork.core.common.log.LogClerk;
//import com.pandawork.core.common.util.Assert;
//import com.pandawork.core.framework.dao.CommonDao;
//import com.pandawork.mapper.UserMapper;
//import com.pandawork.service.UserService;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Collections;
//import java.util.List;
//
///**
// * 用户管理
// * UserService的实现
// */
//@Service("UserService")
//public class UserServiceImpl implements UserService{
//    @Autowired
//   UserService userService;
//
//    @Autowired
//    protected CommonDao commonDao;
//
//    UserMapper userMapper;
//    /**
//     * 遍历
//     *
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public List<User> listAll() throws Exception {
//        List<User> userList = Collections.emptyList();
//        try {
//            userList = userMapper.listAll();
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.ListUserAll, e);
//        }
//        return userList;
//    }
//
//    /**
//     * 增加（注册）
//     * @param user
//     * @throws Exception
//     */
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
//    public void addUser(@Param("addUser") User user) throws Exception {
//        if (Assert.isNull(user)) {
//            return;
//        }
//        Assert.isNotNull(user.getUserName(), NFException.UserNameNotNull);
//        Assert.isNotNull(user.getPassword(), NFException.PasswordNotNull);
//        Assert.isNotNull(user.getPhone());
//        Assert.isNotNull(user.getQq());
//        Assert.isNotNull(user.getEmail());
//        try {
//            userMapper.addUser(user);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.SystemException, e);
//        }
//    }
//
//    /**
//     * 查询（根据userName判断用户是否存在）（即登陆和查重）
//     * @param userName
//     * @return
//     * @throws Exception
//     */
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
//    public User selectUser(@Param("user") String userName) throws Exception{
//        if (!com.pandawork.core.common.util.Assert.isNull(userName)) {
//            return null;
//        }try {
//            return userMapper.selectUser(userName);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.UserNameFailed, e);
//        }
//    }
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
//    public boolean passwordIsTrue(@Param("user") String userName,Integer password) throws Exception{
//        if (!com.pandawork.core.common.util.Assert.isNull(password)) {
//            return false;
//        }try {
//            return userMapper.passwordIsTrue(userName,password);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.PasswordFailed, e);
//        }
//    }
//
//}
