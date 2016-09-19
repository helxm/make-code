package com.pugilist.persistence.dao;

import com.pugilist.model.Gym;
import com.pugilist.model.GymExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GymMapper {
    int countByExample(GymExample example);

    int deleteByExample(GymExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gym record);

    int insertSelective(Gym record);

    List<Gym> selectByExampleWithBLOBs(GymExample example);

    List<Gym> selectByExample(GymExample example);

    Gym selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gym record, @Param("example") GymExample example);

    int updateByExampleWithBLOBs(@Param("record") Gym record, @Param("example") GymExample example);

    int updateByExample(@Param("record") Gym record, @Param("example") GymExample example);

    int updateByPrimaryKeySelective(Gym record);

    int updateByPrimaryKeyWithBLOBs(Gym record);

    int updateByPrimaryKey(Gym record);
}