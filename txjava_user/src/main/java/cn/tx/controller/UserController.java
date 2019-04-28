package cn.tx.controller;

import cn.tx.domain.User;
import cn.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping(path = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }

    /**
     * 查询该用户及其用户所拥有的订单 restful
     * @param id
     * @return
     */
    @RequestMapping(path = "/findUserOrders/{id}",method = RequestMethod.GET)
    public User findUserOrders(@PathVariable("id") Integer id){
        System.out.println("用户微服务...");
        return userService.findUserOrders(id);
    }

}
