package com.githrd.demo_mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.githrd.demo_mybatis.vo.DeptVo;

@Mapper
public interface DeptDao {
    
    // xml의 mapper 정보를 이용하려면? (별도의 mapper 사용하는 방법)
    // 1. DeptDao == DeptDao.xml => dao와 xml 파일 이름 동일하게

    // 2. xml의 namespace = "Mapper정보" (풀경로 적어주기)
    //  namespace="com.githrd.demo_mybatis.dao.DeptDao"

    // 3. mapper id = "메소드명"
    //           id = "selectList"

    //@Select("select * from dept")  -> xml 사용 안하고 이렇게 써도 되지만 sql문이 복잡해질 경우 이렇게 쓰긴 어려움 - mapper 따로 쓰는게 안전
    List<DeptVo> selectList();

    // 방법1) 별도의 mapper 쓰지 않고 어노테이션으로 바로 작성
    @Select("select * from dept where deptno = #{deptno}")
    List<DeptVo> selectListFromDeptNo(int deptno);          // 부서 번호 별 조회

    // 방법2) 별도의 mapper 사용 => 이게 더 안전   
    List<DeptVo> selectListFromLoc(String loc);             // 부서 위치 별 조회

}
