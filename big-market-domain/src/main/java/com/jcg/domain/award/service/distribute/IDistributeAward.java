package com.jcg.domain.award.service.distribute;


import com.jcg.domain.award.model.entity.DistributeAwardEntity;

/**
 * @description 分发奖品接口
 */
public interface IDistributeAward {

    void giveOutPrizes(DistributeAwardEntity distributeAwardEntity);

}
