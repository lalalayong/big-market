package com.jcg.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description 活动抽奖请求对象
 */
@Data
public class ActivityDrawRequestDTO implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
