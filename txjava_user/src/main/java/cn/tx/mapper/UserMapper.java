package cn.tx.mapper;

import cn.tx.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    public List<User> findAll();

    @Select("select * from t_user where id = #{id}")
    User findById(Integer id);
}
