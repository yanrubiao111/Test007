package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetFeeController{
	@ResponseBody
	@RequestMapping(value="/common/getTransportFee",method=RequestMethod.GET)
	public Map<String,String> getByparal(@RequestParam(required=false) Integer list){
		Map<String, String> goods=new HashMap<String, String> ();
		goods.put("省份","河北省石家庄市");
		goods.put("运费","10");
		goods.put("code", "200");
		return goods; 
	}

}