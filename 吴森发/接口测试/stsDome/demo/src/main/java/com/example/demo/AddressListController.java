package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressListController {
	@ResponseBody
	@RequestMapping(value = "/fgadmin/address/list", method = RequestMethod.GET)
	public Map<String, String> getByparal(@RequestParam(required = false) Integer list) {
		Map<String, String> goods = new HashMap<String, String>();
		goods.put("省份", "河北省");
		goods.put("城市", "唐山市");
		goods.put("收件人", "平安");
		goods.put("phone", "123549998");
		goods.put("code", "200");
		return goods;

	}

}
