package com.edu.task;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

import net.sf.json.JSONObject;

public class LoginTest {
	@Test
	public void LoginTest() throws Exception {
		String url="/common/fgadmin/login";
		JSONObject json=new JSONObject();
		json.element("phoneArea", "86");
		json.element("phoneNumber", "20000000000");
		json.element("password","netease123");		
		String result=HttpDriver.doPost(url, json);
		Checker check=new Checker(result);
		System.out.println(result);//¥Ú”°–≈œ¢
		check.verifyXpath("message", "success");	
	}
}
