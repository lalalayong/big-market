package com.jcg.infrastructure.persistent.dao;

import com.jcg.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JCG
 * @description 策略规则 DAO
 */
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

}
