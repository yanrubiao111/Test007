package com.edu.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Testitems extends BaseTest {
	
	/*
	12/5 
	测试网站：http://139.9.83.25
	要求实现功能如下：
	测试项目要求，根据自己测试用例编写。
	*/
	
	//用数据驱动实现登录
	@Test(dataProvider = "applicationData", dataProviderClass = NSDataProvider.class,description = "用数据驱动实现登录")
	public void testApplication(String username, String password,String code) throws InterruptedException {
			webtest.open("http://139.9.83.25");
			Thread.sleep(2000);	
			webtest.click("link=登录");
			Thread.sleep(1000);
			webtest.type("name=username", username);
			webtest.type("name=password", password);
			webtest.type("name=code", code);	//此时设的是万能密码1111
			webtest.click("id=remember-me");
			webtest.click("xpath=//div[@class='col-sm-10 text-center']/button");
			Thread.sleep(1000);
			}	
	
	@Test(description = "控制滚动条拉到底，网页导航栏‘网页logo’点击测试——返回网页首页")
	public void test02() throws InterruptedException {
		/**
	     * 控制滚动条拉动操作
	     */
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.documentElement.scrollTop=10000");//控制滚动条拉到底
	    Thread.sleep(1000);
		webtest.click("class=navbar-brand");// 1 网页导航栏‘网页logo’点击测试——返回网页首页
		}
		
	@Test(description = "网页主页面“最热”选项测试——跳转至相应的页面")
	public void test03() throws InterruptedException {
		webtest.click("xpath=//ul[@class='nav nav-tabs mb-3']/li[2]");// 2 网页主页面“最热”选项测试——跳转至相应的页面
	}
		
	@Test(description = "点击帖子“太冷了”——进入该帖子详情页面")
	public void test04() throws InterruptedException {
		webtest.click("link=太冷了");  //3 点击帖子“太冷了”——进入该帖子详情页面
	}
		
	
	@Test(description = "该帖子下点赞功能测试")
	public void test05() throws InterruptedException {
		webtest.click("link=太冷了"); 
		webtest.click("xpath=//ul[@class='d-inline float-right']/li[1]/a"); // 4 该帖子下点赞功能测试
		Thread.sleep(1000);	
		}					
	
		
	@Test(description = "该帖子下回帖功能测试")
	public void test06() throws InterruptedException {
		webtest.click("link=太冷了"); 
		// 5 该帖子下回帖功能测试
		webtest.click("xpath=//ul[@class='d-inline float-right']/li[3]/a");
		Thread.sleep(1000);
		webtest.type("xpath=//div[@class='container mt-3']/form/p[1]/textarea", "我是来实现自动化测试的呦");  
		webtest.click("xpath=//div[@class='container mt-3']/form/p[2]/button");
	}
		
	
	@Test(description = "帖子中某条回帖的点赞测试")
	public void test07() throws InterruptedException {
		//帖子中某条回帖的点赞测试
		webtest.click("link=太冷了");
		webtest.click("xpath//ul[@class='d-inline float-right']/li[1]/a");
	}
		
	
	@Test(description = "帖子信息回复功能")
	public void test08() throws InterruptedException {
//		 帖子信息回复功能  
//		webtest.click("xpath//ul[@class='d-inline float-right']/li[2]/a");
		webtest.click("link=太冷了");
		webtest.type("xpath//li[@class='pb-3 pt-3']/form/div/input[1]", "我是来实现自动化测试的！");
	}
	
	
	@Test(description = "网页首页“社区”点击测试")
	public void test09() throws InterruptedException {
		//网页首页“社区”点击测试
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[1]/a");
	}
	
	
	@Test(description = "网页首页“消息”点击测试")
	public void test10() throws InterruptedException {
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[2]/a");
	}
	
	@Test(description = "网页首页“橙白OJ”点击测试")
	public void test11() throws InterruptedException {
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[3]/a");
	}
	
	
	@Test(description = "网页首页“站主博客”点击测试")
	public void test12() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[4]/a");
	}
	
	@Test(description = "网页首页“个人中心”点击测试")
	public void test13() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[5]/a");
	}
	@Test(description = "网页首页“个人中心”的个人主页的3个模块点击测试")
	public void test14() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath//div[@id='navbarDropdown']");
		webtest.click("xpath//div[@id='navbarSupportedContent']/ul/li[5]/div/a[1]");
		webtest.open("http://139.9.83.25/user/profile/159");
		webtest.open("http://139.9.83.25/user/mypost/159");
		webtest.open("http://139.9.83.25/user/myreply/159");
		webtest.open("http://139.9.83.25");
	}
	@Test(description = "网页首页“个人中心”的三个模块点击测试")
	public void test15() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.open("http://139.9.83.25/user/se'//tting");
		webtest.open("http://139.9.83.25/index");
}
	@Test(description = "网页首页“搜索框”的搜索测试")
	public void test16() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath/html/body/div/header/div/nav/div/form/input");
		webtest.type("name=keyword", "111111111");
		webtest.open("http://139.9.83.25/error");
		webtest.open("http://139.9.83.25");
}
	@Test(description = "网页页面切换的测试")
	public void test17() throws InterruptedException {
		webtest.open("http://139.9.83.25");
		webtest.click("xpath/html/body/div/div/div/nav/ul/li[4]");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=2");
		webtest.click("xpath/html/body/div/div/div/nav/ul/li[5]/a");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=3");
		webtest.open("http://139.9.83.25/index?orderMode=0&current=1");
}


}