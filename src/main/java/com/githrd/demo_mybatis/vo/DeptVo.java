package com.githrd.demo_mybatis.vo;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok 라이브러리 덕분에 가능한 것
@Data               // @Data = @Getter + @Setter
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // All property 넣어준 Overload된 생성자
@Alias("dept")      // TypeAlias
public class DeptVo {

    int     deptno;
    String  dname;
    String  loc;



    

}
