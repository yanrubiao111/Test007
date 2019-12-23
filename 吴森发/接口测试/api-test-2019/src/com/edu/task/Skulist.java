package com.edu.task;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

public class Skulist {
	@Test
	public void skuList() throws Exception {
		String url="/common/skuList";
		String result=HttpDriver.doGet(url);
		Checker check=new Checker(result);
		check.verifyXpath("code", "200");
	}
}
