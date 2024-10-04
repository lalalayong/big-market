package com.jcg.domain.credit.repository;


import com.jcg.domain.credit.model.aggregate.TradeAggregate;
import com.jcg.domain.credit.model.entity.CreditAccountEntity;

/**
 * @description 用户积分仓储
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

    CreditAccountEntity queryUserCreditAccount(String userId);
}
