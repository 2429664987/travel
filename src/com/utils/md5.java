package com.utils;

import java.util.UUID;

import org.springframework.util.DigestUtils;

public class md5 {

	//md5加密 方法调用
	public static String encodeMD5(String md){
		return DigestUtils.md5DigestAsHex(md.getBytes());
	}
	
	//调用UUID 生成32位id
	public static String uuid(){		
		return UUID.randomUUID().toString().replace("-","");
	}
	
	
}
