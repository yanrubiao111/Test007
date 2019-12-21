package com.edu.qingguo;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import net.sf.json.JSONObject;

public class NewAddressTest {
	String address_list = "/common/fgadmin/address/new";

	@Test
	public void testNewSuccess() throws Exception {
		JSONObject para = new JSONObject();
		para.element("login", "true");
		para.element("id", "");
		para.element("receiverName", "kang");
		para.element("cellPhone", "18032170165");
		para.element("addressDetail", "hebeishida");
		para.element("province", "hebei");
		para.element("city", "shijiazhuang");
		para.element("area", "yuhuaqu");
		String result = HttpDriver.doPost(address_list, para);
		System.out.println(result);
		Checker checker = new Checker(result);
		checker.assertXpath("message", "success");
	}