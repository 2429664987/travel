package com.mapper;

import java.util.List;

import com.model.Banner;
import com.model.Txintroduction;

public interface INtroductionMapper {
	//��ѯ ̽�ռ�� list�б� ����
	public List<Txintroduction> queryintroductionList();
	//��ѯ �ֲ�ͼƬ ����
	public List<Banner> querybanners();
}
