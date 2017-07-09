package com.mapper;

import java.util.List;

import com.model.Banner;
import com.model.Txintroduction;

public interface INtroductionMapper {
	//查询 探险简介 list列表 数据
	public List<Txintroduction> queryintroductionList();
	//查询 轮播图片 数据
	public List<Banner> querybanners();
}
