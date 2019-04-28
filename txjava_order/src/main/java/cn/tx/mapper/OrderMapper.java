package cn.tx.mapper;

import cn.tx.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@Mapper
public interface OrderMapper {

    @Select("select * from t_order")
    public List<Order> findAll();

    @Select("select * from t_order where uid = #{uid}")
    public List<Order> findAllByUid(Integer uid);

}
