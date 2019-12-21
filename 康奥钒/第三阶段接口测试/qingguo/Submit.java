package com.edu.qingguo;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.Common;

import net.sf.json.JSONObject;

//提交订单
public class Submit {
	
	String submit_url="/fgadmin/orders/submit";
	Checker check=null;
	
	@Test
	public void submitTest() throws Exception{
//		CookieStore cookieStore=Common.getCookie("20000000000","netease123");
		JSONObject submitbody=new JSONObject();
//		submitbody.element("skuIds", "2,3");
//		submitbody.element("skuNumbers","1,1");
//		submitbody.element("stockIds","74966312,74966313");
		submitbody.element("login","true");
		submitbody.element("receiverName","张三");
		submitbody.element("cellPhone","12345678901");
		submitbody.element("addressDetail","23");
		submitbody.element("province","浙江省");
		submitbody.element("city","杭州市");
		submitbody.element("area","滨江区");
		submitbody.element("transportFee","8");
		String result=HttpDriver.doPost(submit_url, submitbody);
		System.out.println(result);
		check = new Checker(result);
		check.verifyXpath("message", "success");
		
		
		
	}
	@Test
	public void submitTestfail() throws Exception{
//		CookieStore cookieStore=Common.getCookie("20000000000","netease123");
		JSONObject submitbody=new JSONObject();
//		submitbody.element("skuIds", "2,3");
//		submitbody.element("skuNumbers","1,1");
//		submitbody.element("stockIds","74966312,74966313");
		submitbody.element("login","false");
		submitbody.element("receiverName","张三");
		submitbody.element("cellPhone","12345678901");
		submitbody.element("addressDetail","23");
		submitbody.element("province","浙江省");
		submitbody.element("city","杭州市");
		submitbody.element("area","滨江区");
		submitbody.element("transportFee","8");
		String result=HttpDriver.doPost(submit_url, submitbody);
		System.out.println(result);
		check =new Checker(result);
//		check.verify("message","false");
		if ("login".equals("true")) {
			try {
				check.verifyXpath("message", "success");
			} catch (Exception e) {
				e.printStackTrace();
			}			
		} 
		else {
			return;
//			System.out.println("请重新登录"); 
		}	

	}
	
	
	
}