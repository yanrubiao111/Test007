package com.edu.task;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.Common;

import net.sf.json.JSONObject;

public class New {
	String new_url="/common/fgadmin/address/new";
	Checker check = null;
	@Test
	public void New() throws Exception {
		CookieStore cookie=Common.getCookie("20000000000", "netease123");
		JSONObject para=new JSONObject();
		para.element("id","123456");
		para.element("receiverName","22");
		para.element("cellPhone","12615813537");
		para.element("login","true");//为true时说明登陆成功
		para.element("addressDetail","22");
		para.element("province","22");
		para.element("city","22");
		para.element("area","22");
		String result=HttpDriver.doPost(new_url, para, cookie);
		check = new Checker(result);
//		System.out.println(result);
		System.out.println(result);//打印信息
		check.verifyXpath("message", "success");
//		check.verifyXpath("code","200");
	}
}
