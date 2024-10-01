package com.jcg.domain.activity.service.armory;

/**
 * @description 活动装配预热
 */
public interface IActivityArmory {

    boolean assembleActivitySku(Long sku);
    boolean assembleActivitySkuByActivityId(Long activityId);

}
