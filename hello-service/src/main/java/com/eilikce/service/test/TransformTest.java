package com.eilikce.service.test;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.eilikce.service.bo.UserBo;
import com.eilikce.service.po.UserPo;

public class TransformTest {
	public static void main(String[] args) {
		UserPo up = new UserPo("Eilikce", "M", "123", 25);
		UserBo ub = new UserBo();
		
		System.out.println(ub);
		try {
			BeanUtils.copyProperties(ub, up);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ub);

		
	}
}
