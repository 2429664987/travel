package com.utils;

import java.util.UUID;

import org.springframework.util.DigestUtils;

public class md5 {

	//md5���� ��������
	public static String encodeMD5(String md){
		return DigestUtils.md5DigestAsHex(md.getBytes());
	}
	
	//����UUID ����32λid
	public static String uuid(){		
		return UUID.randomUUID().toString().replace("-","");
	}
	
	
}
