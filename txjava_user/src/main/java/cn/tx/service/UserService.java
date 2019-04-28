package cn.tx.service;

import cn.tx.domain.User;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public interface UserService {

    public List<User> findAll();

    User findUserOrders(Integer id);

}
