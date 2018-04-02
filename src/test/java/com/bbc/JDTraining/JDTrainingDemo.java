package com.bbc.JDTraining;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class JDTrainingDemo {
//实例化对象
	WebDriver firefox;
	
	@Test
	public void JDTrainingDemoTest() {
		firefox=new FirefoxDriver();
		//设置火狐浏览器驱动的路径
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Java\\geckodriver.exe");
		//将路径“C:\\Program Files”路径放到环境变量classpath中，将路径相对化
		//System.setProperty("webdriver.gecko.driver", System.getenv("JAVA_HOME")+"\\geckodriver.exe");
		//设置火狐浏览器的路径
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//将路径“C:\\Program Files”路径放到环境变量classpath中，将路径相对化
		System.setProperty("webdriver.firefox.bin", System.getenv("JAVA_HOME")+"\\firefox.exe");
		//打开网页百度
		firefox.get("https://www.baidu.com");
		//获取当前的网页的url
		String strUrl=firefox.getCurrentUrl();
		//输出当前网页的url
		System.out.println(strUrl);
		//断言
		assertNotEquals(strUrl,"https://www.jd.com/","url相等");
	}
	@AfterMethod
	public void AfterMethodDemo() {
		//关闭浏览器
		firefox.close();
		//结束进程
		firefox.quit();
	}

}
