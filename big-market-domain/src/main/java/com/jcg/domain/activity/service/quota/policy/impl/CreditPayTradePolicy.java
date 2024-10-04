package com.jcg.domain.activity.service.quota.policy.impl;

import com.jcg.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import com.jcg.domain.activity.model.valobj.OrderStateVO;
import com.jcg.domain.activity.repository.IActivityRepository;
import com.jcg.domain.activity.service.quota.policy.ITradePolicy;
import org.springframework.stereotype.Service;

/**
 * @description 积分兑换，支付类订单
 */
@Service("credit_pay_trade")
public class CreditPayTradePolicy implements ITradePolicy {

    private final IActivityRepository activityRepository;

    public CreditPayTradePolicy(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate) {
        createQuotaOrderAggregate.setOrderState(OrderStateVO.wait_pay);
        activityRepository.doSaveCreditPayOrder(createQuotaOrderAggregate);
    }

}
