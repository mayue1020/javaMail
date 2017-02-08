package com.mail.main;

import com.mail.util.SendMail;

public class main {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SendMail a = new SendMail();
        a.sendMail("869102550@163.com", "869102550", "mayue19951020.",  
                "869102550@qq.com",  
                "Java Mail 测试邮件",  
                "<a>html 元素</a>：<b>邮件内容</b>");  
	}

}
