package com.example.demo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class NewController {
	Cookie cookie;

	@ResponseBody
	@RequestMapping(value = "/common/fgadmin/address/new", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject getByJSON(@RequestBody JSONObject jsonParam, HttpServletResponse response) {
		String id = jsonParam.getString("id");
		String receiverName = jsonParam.getString("receiverName");
		String cellPhone = jsonParam.getString("cellPhone");
		String login = jsonParam.getString("login");
		String province = jsonParam.getString("province");
		String city = jsonParam.getString("city");
		String area = jsonParam.getString("area");
		String addressDetail = jsonParam.getString("addressDetail");
		
		JSONObject result = new JSONObject();
		if(login.equals("true")){
			if (receiverName.trim().toString()!=null&&cellPhone.trim().toString()!=null &&province.trim().toString()!=null &&
					city.trim().toString()!=null&area.trim().toString()!=null&&addressDetail.trim().toString()!=null) {
				result.element("message", "NewController success");
			} else {
				result.element("message", "fail");
			}
		}else{
			result.element("message", "请先登录！");
		}
		return result;
	}
}
