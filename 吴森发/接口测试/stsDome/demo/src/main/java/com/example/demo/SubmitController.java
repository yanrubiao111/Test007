package com.example.demo;

import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class SubmitController {
	
//	private static Cookie cookie;

	@ResponseBody
	@RequestMapping(value="/fgadmin/orders/submit",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(@RequestBody JSONObject jsonParam,HttpServletResponse response){

		String receiverName=jsonParam.getString("receiverName");
		String cellPhone=jsonParam.getString("cellPhone");
		String login=jsonParam.getString("login");
		String province=jsonParam.getString("province");
		String city=jsonParam.getString("city");
		String area=jsonParam.getString("area");
		String transportFee=jsonParam.getString("transportFee");

		JSONObject result=new JSONObject();
		if(login.equals("true")){
			if(receiverName!=null && cellPhone!=null && province!=null && city!=null && area!=null && transportFee!=null){
//				cookie = new Cookie("login","true");
//				response.addCookie(cookie);
				result.element("message","SubmitController success");
			}
			else{
				result.element("message","fail");
			}
		}
		else{
			result.element("message","请重新登录");
		}
		
		return result;
	}
}
