package com.chunboyang.week3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chunboyang.week3.service.CompanyService;
import com.chunboyang.week3.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class CompanyController {
	
	@Resource
	private CompanyService companyService;
	
	
	@RequestMapping("list")
	public String list(Model model ,@RequestParam(defaultValue="1") Integer page,@RequestParam(defaultValue="10") Integer pageSize
		,@RequestParam(defaultValue="")String minMoney,@RequestParam(defaultValue="") String maxMoney,@RequestParam(defaultValue="")String tid	
			
			) {
		//封装查询条件
		Map<String ,Object > map  = new HashMap<>();
		 map.put("minMoney", minMoney);
		 map.put("maxMoney", maxMoney);
		 if(null!=tid && tid.equals("99")) {
		   map.put("tid", "3,5"); //其他公司类型
		 }else {
		 map.put("tid", tid); 
		 }
		 
		 //分页
		PageHelper.startPage(page, pageSize);
		List<Map> list = companyService.list(map);
		PageInfo<Map> pageInfo = new PageInfo<>(list);
		String info = PageUtil.page(page, pageInfo.getPages(), "/list?minMoney="+minMoney+"&maxMoney="+maxMoney+"&tid="+tid, pageSize);
		
		model.addAttribute("info", info);
		model.addAttribute("list", list);
		//封装查询条件
		model.addAttribute("minMoney", minMoney);
		model.addAttribute("maxMoney", maxMoney);
		model.addAttribute("tid", tid);
		
		return "list";
		
		
	}

	
	
	

}
