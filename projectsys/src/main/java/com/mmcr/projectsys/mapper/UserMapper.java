package com.mmcr.projectsys.mapper;

import com.mmcr.projectsys.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2018/2/12.
 */
public interface UserMapper {
    @Select("SELECT * FROM ps_user WHERE id = #{id}")
    User getUserById(Long id);

    @Select("SELECT * FROM ps_user")
    List<User> getUserList();

    @Insert("INSERT INTO ps_user(nickname,password,cell_phone_number,add_time,head_portrait,gender) VALUES(#{nickname},#{password},#{cellPhoneNumber},#{addTime},#{headPortrait},#{gender})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int addUser(User user);

    @Update("UPDATE ps_user SET nickname=#{nickname},password=#{password},cell_phone_number=#{cellPhoneNumber},add_time=#{addTime},head_portrait=#{headPortrait},gender=#{gender} WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM ps_user WHERE id = #{id}")
    int deleteUser(Long id);
}
