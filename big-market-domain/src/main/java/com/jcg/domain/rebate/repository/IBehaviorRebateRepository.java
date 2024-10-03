package com.jcg.domain.rebate.repository;

import com.jcg.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import com.jcg.domain.rebate.model.entity.BehaviorRebateOrderEntity;
import com.jcg.domain.rebate.model.valobj.BehaviorTypeVO;
import com.jcg.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * @description 行为返利服务仓储接口
 */
public interface IBehaviorRebateRepository {

    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);

    List<BehaviorRebateOrderEntity> queryOrderByOutBusinessNo(String userId, String outBusinessNo);
}
