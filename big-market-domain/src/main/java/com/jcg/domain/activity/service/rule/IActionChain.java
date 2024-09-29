package com.jcg.domain.activity.service.rule;


import com.jcg.domain.activity.model.entity.ActivityCountEntity;
import com.jcg.domain.activity.model.entity.ActivityEntity;
import com.jcg.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @description 下单规则过滤接口
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
