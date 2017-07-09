package com.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.mapper.INtroductionMapper;
import com.model.Banner;
import com.model.Txintroduction;
import com.service.IntroductionService;
@Service
public class IntroductionServiceImpl implements IntroductionService {

	@Resource(name="INtroductionMapper")
	INtroductionMapper introductionMapper;
	
	//查询 探险简介 list列表 数据
	public String queryintroductionList() {
		
		List<Txintroduction> list=introductionMapper.queryintroductionList();
		 
		 JSONArray array=new JSONArray();
		 array.addAll(list);
				 
		return array.toString();		
	}
	
	//测试:1   json数据转化
	public static void main(String[] args) {
		
		Txintroduction are=new Txintroduction();
		
		JSONObject item=JSONObject.fromObject(are);
		
		System.out.println(item.toString());
		
		
	}
	
	
	//查询 轮播图片 转化为json数据
	@Override
	public String querybanners() {
		
		List<Banner> balist=introductionMapper.querybanners();
		 JSONArray array=new JSONArray();
		 array.addAll(balist);
		 
		return array.toString();
	}

}
