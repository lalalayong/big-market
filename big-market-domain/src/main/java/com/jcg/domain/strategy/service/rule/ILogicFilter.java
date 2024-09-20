package com.jcg.domain.strategy.service.rule;


import com.jcg.domain.strategy.model.entity.RuleActionEntity;
import com.jcg.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @description 抽奖规则过滤接口
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
