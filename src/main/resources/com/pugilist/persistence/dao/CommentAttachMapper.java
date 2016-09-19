package com.pugilist.persistence.dao;

import com.pugilist.model.CommentAttach;
import com.pugilist.model.CommentAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentAttachMapper {
    int countByExample(CommentAttachExample example);

    int deleteByExample(CommentAttachExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentAttach record);

    int insertSelective(CommentAttach record);

    List<CommentAttach> selectByExample(CommentAttachExample example);

    CommentAttach selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentAttach record, @Param("example") CommentAttachExample example);

    int updateByExample(@Param("record") CommentAttach record, @Param("example") CommentAttachExample example);

    int updateByPrimaryKeySelective(CommentAttach record);

    int updateByPrimaryKey(CommentAttach record);
}