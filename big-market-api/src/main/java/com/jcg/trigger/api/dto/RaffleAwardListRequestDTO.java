package com.jcg.trigger.api.dto;

import lombok.Data;

/**
 * @description 抽奖奖品列表，请求对象
 */
@Data
public class RaffleAwardListRequestDTO {

    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}
