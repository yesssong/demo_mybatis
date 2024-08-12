package com.githrd.demo_mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.githrd.demo_mybatis.vo.SawonVo;

@Mapper
public interface SawonDao {

    // 내가 한거
    @Select("select * from sawon")
    List<SawonVo> selectList();
    
    // 선생님이 하신 것 -> Map 사용 이유 : 검색?
    List<SawonVo> selectList1(Map<String, Object> map);


}
