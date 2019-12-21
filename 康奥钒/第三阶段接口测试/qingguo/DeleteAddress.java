package com.edu.qingguo;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import net.sf.json.JSONObject;

public class DeleteAddressTest {
	String address_list = "/fgadmin/address/delete";

	@Test
	public void testDeleteSuccess() throws Exception {
		JSONObject para = new JSONObject();
		para.element("login", "true");
		para.element("id", "77243286");
		String result = HttpDriver.doPost(address_list, para);
		System.out.println(result);
		Checker checker = new Checker(result);
		checker.assertXpath("message", "success");
	}