package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.Iteams;
import cn.itcast.ssm.po.IteamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IteamsMapper {
    int countByExample(IteamsExample example);

    int deleteByExample(IteamsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Iteams record);

    int insertSelective(Iteams record);

    List<Iteams> selectByExampleWithBLOBs(IteamsExample example);

    List<Iteams> selectByExample(IteamsExample example);

    Iteams selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Iteams record, @Param("example") IteamsExample example);

    int updateByExampleWithBLOBs(@Param("record") Iteams record, @Param("example") IteamsExample example);

    int updateByExample(@Param("record") Iteams record, @Param("example") IteamsExample example);

    int updateByPrimaryKeySelective(Iteams record);

    int updateByPrimaryKeyWithBLOBs(Iteams record);

    int updateByPrimaryKey(Iteams record);
}