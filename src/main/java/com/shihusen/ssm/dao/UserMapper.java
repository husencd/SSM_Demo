package com.shihusen.ssm.dao;

import com.shihusen.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
/*    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);*/

    int checkLogin(User user);
}