package com.edu.task;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

public class GetFeeController {
	@Test
	public void GetFeeController() throws Exception {
		String url="/common/getTransportFee";
		String result=HttpDriver.doGet(url);
		Checker check=new Checker(result);
		check.verifyXpath("code", "200");
	}}