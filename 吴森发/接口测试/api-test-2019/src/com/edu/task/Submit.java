package com.edu.task;


import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.Common;

import net.sf.json.JSONObject;
public class Submit {
	String submit_url="/fgadmin/orders/submit";
	Checker check = null;
	@Test
	public void Submit() throws Exception {
		CookieStore cookie=Common.getCookie("20000000000", "netease123");
		JSONObject para=new JSONObject();
		para.element("receiverName","11");
		para.element("login","true"); //为true时说明登陆成功
		para.element("cellPhone","12615813537");
		para.element("province","11");
		para.element("city","11");
		para.element("area","11");
		para.element("transportFee","1000");
		String result=HttpDriver.doPost(submit_url, para, cookie);
		check = new Checker(result);
		System.out.println(result);
		check.verifyXpath("message", "success");
//		check.verifyXpath("code","200");
	}
}
