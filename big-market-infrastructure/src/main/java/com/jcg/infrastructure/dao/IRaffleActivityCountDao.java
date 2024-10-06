package com.jcg.infrastructure.dao;

import com.jcg.infrastructure.dao.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 抽奖活动次数配置表Dao
 */
@Mapper
public interface IRaffleActivityCountDao {

    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
