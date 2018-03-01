package com.itfan.user.mapper;


import com.itfan.user.domain.ItfanUser;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItfanUserMapper {


    /**
     * 主键查询
     */
    @Select("select * from itfan_user where user_id = #{userId}")
    ItfanUser selectByPrimaryKey(Integer userId);

    /**
     * 用户名查询
     */
    @Select("select * from itfan_user where user_name = #{userName}")
    ItfanUser selectByUserName(String userName);

    /**
     * 查询所有用户
     */
    @Select("select * from itfan_user")
    List<ItfanUser> selectAll();

    /**
     * 根据UserId查询
     */
    @Select("select * from itfan_user where user_id = #{userId}")
    ItfanUser selectByUserId(Integer userId);


    /**
     * 插入数据
     */
    @Insert("insert into itfan_user(user_name,password,roles) values(#{userName},#{password},#{roles})")
    Integer insert(ItfanUser user);

    /**
     * 根据UserId删除数据
     */
    @Delete("delete from itfan_user where user_id = #{useId}")
    Integer del(Integer userId);
}