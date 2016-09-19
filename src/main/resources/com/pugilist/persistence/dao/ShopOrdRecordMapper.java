package com.pugilist.persistence.dao;

import com.pugilist.model.ShopOrdRecord;
import com.pugilist.model.ShopOrdRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopOrdRecordMapper {
    int countByExample(ShopOrdRecordExample example);

	int deleteByExample(ShopOrdRecordExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(ShopOrdRecord record);

	int insertSelective(ShopOrdRecord record);

	List<ShopOrdRecord> selectByExample(ShopOrdRecordExample example);

	ShopOrdRecord selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ShopOrdRecord record, @Param("example") ShopOrdRecordExample example);

	int updateByExample(@Param("record") ShopOrdRecord record, @Param("example") ShopOrdRecordExample example);

	int updateByPrimaryKeySelective(ShopOrdRecord record);

	int updateByPrimaryKey(ShopOrdRecord record);

	int countByExample(ShopOrdRecordExample example);

    int deleteByExample(ShopOrdRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrdRecord record);

    int insertSelective(ShopOrdRecord record);

    List<ShopOrdRecord> selectByExample(ShopOrdRecordExample example);

    ShopOrdRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrdRecord record, @Param("example") ShopOrdRecordExample example);

    int updateByExample(@Param("record") ShopOrdRecord record, @Param("example") ShopOrdRecordExample example);

    int updateByPrimaryKeySelective(ShopOrdRecord record);

    int updateByPrimaryKey(ShopOrdRecord record);
}