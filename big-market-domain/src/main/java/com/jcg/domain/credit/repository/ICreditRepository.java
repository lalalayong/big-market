package com.jcg.domain.credit.repository;


import com.jcg.domain.credit.model.aggregate.TradeAggregate;

/**
 * @description 用户积分仓储
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

}
