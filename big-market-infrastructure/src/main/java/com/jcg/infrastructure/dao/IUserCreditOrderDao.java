package com.jcg.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.jcg.infrastructure.dao.po.UserCreditOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 用户积分流水单 DAO
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {

    void insert(UserCreditOrder userCreditOrderReq);

}
