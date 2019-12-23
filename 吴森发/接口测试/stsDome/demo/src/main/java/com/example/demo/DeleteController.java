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
public class DeleteController {
	Cookie cookie;

	@ResponseBody
	@RequestMapping(value = "/fgadmin/address/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject getByJSON(@RequestBody JSONObject jsonParam, HttpServletResponse response) {
		String id = jsonParam.getString("id");
		String login = jsonParam.getString("login");
		JSONObject result = new JSONObject();
		if(login.equals("true")){
			if (id.trim().toString()!=null) {
				result.element("message", "delete success");
			} else {
				result.element("message", "fail");
			}
		}else{
			result.element("message", "请先登录！");
		}
		return result;
	}
}
