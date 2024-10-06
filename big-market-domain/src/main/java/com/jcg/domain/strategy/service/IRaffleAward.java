package com.jcg.domain.strategy.service;


import com.jcg.domain.strategy.model.entity.StrategyAwardEntity;
import com.jcg.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

import java.util.List;

/**
 * @description 策略奖品接口
 */
public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param activityId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardListByActivityId(Long activityId);

    /**
     * 查询有效活动的奖品配置
     *
     * @return 奖品配置列表
     */
    List<StrategyAwardStockKeyVO> queryOpenActivityStrategyAwardList();
}
