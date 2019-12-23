package com.edu.task;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.Common;

import net.sf.json.JSONObject;

public class Delete {
	String delete_url="/fgadmin/address/delete";
	Checker check = null;
	@Test
	public void Delete() throws Exception {
		
		CookieStore cookie=Common.getCookie("20000000000", "netease123");//进行传参
		JSONObject para=new JSONObject();
		para.element("id","123456");
		para.element("login","true");  //true为登陆成功
		String result=HttpDriver.doPost(delete_url, para, cookie);//进行传参
		check = new Checker(result);
		System.out.println(result);//打印信息
		check.verifyXpath("message", "success");
//		check.verifyXpath("code","200");
	}
}
