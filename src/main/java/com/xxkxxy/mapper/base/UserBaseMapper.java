package com.xxkxxy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.xxkxxy.entity.base.BaseUser;
/**
*  @author 
*/
public interface UserBaseMapper {

    int insertBaseUser(BaseUser object);

    int updateBaseUser(BaseUser object);

    List<BaseUser> queryBaseUser(BaseUser object);

    BaseUser queryBaseUserLimit1(BaseUser object);

}