//package com.pandawork.service;
//
//import com.pandawork.common.entity.User;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
///**
// * 用户user
// */
//public interface UserService {
//
//    /**
//     * 主页（遍历）
//     * @throws Exception
//     * @return
//     */
//    public List<User> listAll( ) throws Exception;
//
//    /**
//     * 增加用户（注册）
//     * @param user
//     * @return
//     * @throws Exception
//     */
//    public void addUser(@Param("user") User user) throws Exception;
//
//    /**
//     *查询（根据userName判断用户是否存在）（即登陆和查重）
//     * @param userName
//     * @return
//     * @throws Exception
//     */
//    public User selectUser(@Param("user") String userName) throws Exception;
//
//    /**
//     *判断密码是否正确
//     * @param userName
//     * @param password
//     * @return
//     * @throws Exception
//     */
//    public boolean passwordIsTrue(@Param("user") String userName,Integer password) throws Exception;
//}
