package com.jcg.trigger.api;

import com.jcg.trigger.api.response.Response;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description DCC 动态配置中心
 * @create 2024-07-13 08:58
 */
public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);

}
