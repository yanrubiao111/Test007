package com.edu.test;

import org.testng.annotations.Listeners;

public class TestCases extends BaseTest{
	@Test
	public void test1(){
		System.out.println("hello");
	}
	@Test(description = "�û���¼")
	public void test01() throws InterruptedException {
		
//	�򿪱�����վ
		webtest.open("http://139.9.83.25");
		Thread.sleep(2000);
		
		webtest.click("link=��¼");
		Thread.sleep(1000);
		webtest.type("name=username", "zxr1212");
		webtest.type("name=password", "1212sunshine");
		webtest.type("name=code", "1111");	//��ʱ�������������1111
		webtest.click("id=remember-me");
//		webtest.click("class=col-sm-10 text-center");
		webtest.click("xpath=//div[@class='col-sm-10 text-center']/button");
		Thread.sleep(1000); 
		}

} 
