package com.edu.task;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

public class AddressListController {

	@Test
	public void AddressListController() throws Exception {
		String url="/fgadmin/address/list";
		String result=HttpDriver.doGet(url);
		Checker check=new Checker(result);	
		check.verifyXpath("code", "200");	
	}
}
