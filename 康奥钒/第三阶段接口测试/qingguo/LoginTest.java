package com.edu.qingguo;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

import net.sf.json.JSONObject;

//登录

public class LoginTest {
	
	String login_url="/common/fgadmin/login";
	Checker check=null;
	
	public void login(Object phoneArea,Object phoneNumber,Object password){
		JSONObject user=new JSONObject();
		user.element("phoneArea", phoneArea);
		user.element("phoneNumber",phoneNumber);
		user.element("password",password);
		String result=HttpDriver.doPost(login_url, user);
		System.out.println(result);
		check=new Checker(result);
	}
	
	@Test(description="登录成功")
	public void Login(){
		login("86", "20000000000", "netease123");
		try {
			check.verifyXpath("message", "success");
//			check.verifyXpath("code", "200");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(description="登录失败")
	public void Loginfail(){
		login("86", "20000000000", "netease");
		try {
			check.verifyXpath("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}