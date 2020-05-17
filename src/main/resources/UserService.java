package com.offcn.springbootjpathy.service;

import com.offcn.springbootjpathy.model.User;

import java.util.List;

/**
 * @author zhangjian
 * @email 13120082225@163.com
 * @date 2020/5/11
 */
public interface UserService {

    /**
     * 获取全部用户数据
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 新增用户数据
     *
     * @param user
     */
    void createUser(User user);

    /**
     * 获取指定id用户信息
     *
     * @param id
     * @return
     */
    User getUser(Long id);

    /**
     * 更新指定id用户信息
     *
     * @param id
     * @param user
     */
    void updateUser(Long id, User user);

    /**
     * 删除指定id用户
     *
     * @param id
     */
    void deleteUser(Long id);

}
