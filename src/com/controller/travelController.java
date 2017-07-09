package com.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.IntroductionService;

@Controller
public class travelController {

	@Resource(name="introductionServiceImpl")
	IntroductionService introductionService;
	
	
	//   http://127.0.0.1:8080/travel/queryintroductionList.htmlx
	@ResponseBody
	@RequestMapping(path="queryintroductionList", produces= "application/json; charset=utf-8")
	public String queryintroductionLists(HttpServletRequest request,HttpServletResponse response,Integer parentId){
		String result=introductionService.queryintroductionList();
		return result;
	}
	
	//查询 轮播图片 转化为json数据    http://127.0.0.1:8080/travel/querybanners.htmlx
	@ResponseBody
	@RequestMapping(path="querybanners", produces= "application/json; charset=utf-8")
	public String querybanners(HttpServletRequest request,HttpServletResponse response,Integer parentId){
		String result=introductionService.querybanners();
		return result;
	}
	}
