package cn.tx.service;

import cn.tx.domain.Order;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public interface OrderService {

    public List<Order> findAll();

    public List<Order> findAllByUid(Integer uid) throws Exception;

}
