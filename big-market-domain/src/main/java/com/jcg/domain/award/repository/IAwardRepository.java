package com.jcg.domain.award.repository;


import com.jcg.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @description 奖品仓储服务
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
