package cn.tx.service.impl;

import cn.tx.domain.Order;
import cn.tx.mapper.OrderMapper;
import cn.tx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }

    /**
     * 查询用户下的订单
     * @param uid
     * @return
     */
    @Override
    public List<Order> findAllByUid(Integer uid) throws Exception{
    int a = 1/0;
        new RuntimeException("空");
        String info = null ;
        System.out.println(info);
        return orderMapper.findAllByUid(uid);
    }

}
