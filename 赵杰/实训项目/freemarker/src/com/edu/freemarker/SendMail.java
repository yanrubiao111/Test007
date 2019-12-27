package com.edu.freemarker;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import bsh.This;
import bsh.util.Sessiond;

public class SendMail {
//	服务器地址:
//	POP3服务器: pop.126.com
//	SMTP服务器: smtp.126.com
//	IMAP服务器: imap.126.com
	static int port = 25;
	static String server = "smtp.126.com";  //这里我们用了SMTP服务
	static String from = "吴森发";//发件人的姓名
	static String user = "testwusenfa@126.com";  //发件人账号
	static String password = "test666666"; //是授权码，不是密码
    public static void sendEmail(String email, String subject, String body) throws UnsupportedEncodingException {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", server);
            props.put("mail.smtp.port", String.valueOf(port));
            props.put("mail.smtp.auth", "true");
            Transport transport = null;
            Session session = Session.getDefaultInstance(props,null);
            transport = session.getTransport("smtp");
            transport.connect(server, user, password);
            MimeMessage msg = new MimeMessage(session);
            msg.setSentDate(new Date());
            InternetAddress fromAddress = new InternetAddress(user,from,"UTF-8");
            msg.setFrom(fromAddress);
            String emailList[]=email.split(",");
            InternetAddress[] toAddress = new InternetAddress[emailList.length];
            for(int i=0;i<emailList.length;i++)
            {
            	toAddress[i]=new InternetAddress(emailList[i]);
            }
            msg.addRecipients(Message.RecipientType.TO, toAddress);
            msg.setSubject(subject, "UTF-8");   
            msg.setContent(body, "text/html;charset=utf-8");
            msg.saveChanges();
            transport.sendMessage(msg, msg.getAllRecipients());
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws UnsupportedEncodingException
    {
    	SendMail.sendEmail("1562122174@qq.com", "实现测试邮箱000", "Hello World!");
    	System.out.println("已发送成功！");
    	
//    						收件人 					标题				正文内容
    	
    	
    }


}
