package com.edu.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Testitems extends BaseTest {
	
	/*
	12/5 
	������վ��http://139.9.83.25
	Ҫ��ʵ�ֹ������£�
	������ĿҪ�󣬸����Լ�����������д��
	*/
	
	//����������ʵ�ֵ�¼
	@Test(dataProvider = "applicationData", dataProviderClass = NSDataProvider.class,description = "����������ʵ�ֵ�¼")
	public void testApplication(String username, String password,String code) throws InterruptedException {
			webtest.open("http://139.9.83.25");
			Thread.sleep(2000);	
			webtest.click("link=��¼");
			Thread.sleep(1000);
			webtest.type("name=username", username);
			webtest.type("name=password", password);
			webtest.type("name=code", code);	//��ʱ�������������1111
			webtest.click("id=remember-me");
			webtest.click("xpath=//div[@class='col-sm-10 text-center']/button");
			Thread.sleep(1000);
			}	
	
	@Test(description = "���ƹ����������ף���ҳ����������ҳlogo��������ԡ���������ҳ��ҳ")
	public void test02() throws InterruptedException {
		/**
	     * ���ƹ�������������
	     */
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.documentElement.scrollTop=10000");//���ƹ�����������
	    Thread.sleep(1000);
		webtest.click("class=navbar-brand");// 1 ��ҳ����������ҳlogo��������ԡ���������ҳ��ҳ
		}
		
	@Test(description = "��ҳ��ҳ�桰���ȡ�ѡ����ԡ�����ת����Ӧ��ҳ��")
	public void test03() throws InterruptedException {
		webtest.click("xpath=//ul[@class='nav nav-tabs mb-3']/li[2]");// 2 ��ҳ��ҳ�桰���ȡ�ѡ����ԡ�����ת����Ӧ��ҳ��
	}
		
	@Test(description = "������ӡ�̫���ˡ������������������ҳ��")
	public void test04() throws InterruptedException {
		webtest.click("link=̫����");  //3 ������ӡ�̫���ˡ������������������ҳ��
	}
		
	
	@Test(description = "�������µ��޹��ܲ���")
	public void test05() throws InterruptedException {
		webtest.click("link=̫����"); 
		webtest.click("xpath=//ul[@class='d-inline float-right']/li[1]/a"); // 4 �������µ��޹��ܲ���
		Thread.sleep(1000);	
		}					
	
		
	@Test(description = "�������»������ܲ���")
	public void test06() throws InterruptedException {
		webtest.click("link=̫����"); 
		// 5 �������»������ܲ���
		webtest.click("xpath=//ul[@class='d-inline float-right']/li[3]/a");
		Thread.sleep(1000);
		webtest.type("xpath=//div[@class='container mt-3']/form/p[1]/textarea", "������ʵ���Զ������Ե���");  
		webtest.click("xpath=//div[@class='container mt-3']/form/p[2]/button");
	}
		
	
	@Test(description = "������ĳ�������ĵ��޲���")
	public void test07() throws InterruptedException {
		//������ĳ�������ĵ��޲���
		webtest.click("link=̫����");
		webtest.click("xpath//ul[@class='d-inline float-right']/li[1]/a");
	}
		
	
	@Test(description = "������Ϣ�ظ�����")
	public void test08() throws InterruptedException {
//		 ������Ϣ�ظ�����  
//		webtest.click("xpath//ul[@class='d-inline float-right']/li[2]/a");
		webtest.click("link=̫����");
		webtest.type("xpath//li[@class='pb-3 pt-3']/form/div/input[1]", "������ʵ���Զ������Եģ�");
	}
	
	
	@Test(description = "��ҳ��ҳ���������������")
	public void test09() throws InterruptedException {
		//��ҳ��ҳ���������������
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[1]/a");
	}
	
	
	@Test(description = "��ҳ��ҳ����Ϣ���������")
	public void test10() throws InterruptedException {
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[2]/a");
	}
	
	@Test(description = "��ҳ��ҳ���Ȱ�OJ���������")
	public void test11() throws InterruptedException {
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[3]/a");
	}
	
	
	@Test(description = "��ҳ��ҳ��վ�����͡��������")
	public void test12() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[4]/a");
	}
	
	@Test(description = "��ҳ��ҳ���������ġ��������")
	public void test13() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[5]/a");
	}
	@Test(description = "��ҳ��ҳ���������ġ��ĸ�����ҳ��3��ģ��������")
	public void test14() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarDropdown']");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[5]/div/a[1]");
		webtest.open("http://139.9.83.25/user/profile/159");
		webtest.open("http://139.9.83.25/user/mypost/159");
		webtest.open("http://139.9.83.25/user/myreply/159");
		webtest.open("http://139.9.83.25");
	}
	@Test(description = "��ҳ��ҳ���������ġ�������ģ��������")
	public void test15() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.open("http://139.9.83.25/user/se'//tting");
		webtest.open("http://139.9.83.25/index");
}
	@Test(description = "��ҳ��ҳ�������򡱵���������")
	public void test16() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath/html/body/div/header/div/nav/div/form/input");
		webtest.type("name=keyword", "111111111");
		webtest.open("http://139.9.83.25/error");
		webtest.open("http://139.9.83.25");
}
	@Test(description = "��ҳҳ���л��Ĳ���")
	public void test17() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath/html/body/div/div/div/nav/ul/li[4]");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=2");
		webtest.click("xpath/html/body/div/div/div/nav/ul/li[5]/a");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=3");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=1");
}


}