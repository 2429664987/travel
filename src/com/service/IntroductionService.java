package com.service;

import java.util.List;

import com.model.Banner;
import com.model.Txintroduction;

public interface IntroductionService {

	//查询 探险简介 list列表 数据
	public String  queryintroductionList();
	//查询 轮播图片 数据
	public String querybanners();
	
}
