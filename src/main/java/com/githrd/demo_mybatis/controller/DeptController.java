package com.githrd.demo_mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.githrd.demo_mybatis.dao.DeptDao;
import com.githrd.demo_mybatis.vo.DeptVo;


@Controller
public class DeptController {

    // DeptDao(인터페이스)와 연결
    @Autowired
    DeptDao dept_dao;

    @RequestMapping("/dept/list.do")
    //@ResponseBody
    public String list(Model model){

        // 전체 조회
        // List<DeptVo> list = dept_dao.selectList();        
        // System.out.println(list.size());

        // 부서 별 조회                                     30번 부서
        // List<DeptVo> list = dept_dao.selectListFromDeptNo(30);

        // 위치 별 조회                                    101호
        List<DeptVo> list = dept_dao.selectListFromLoc("101");

        model.addAttribute("list", list);

        return "dept/dept_list";
    }
    
    

}
