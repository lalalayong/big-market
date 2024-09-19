package com.jcg.infrastructure.persistent.dao;

import com.jcg.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JCG
 * @description 奖品表DAO
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
