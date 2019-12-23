package com.example.demo;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;
@RestController
public class SkulistController {
	@RequestMapping(value="/common/skuList",method=RequestMethod.GET)
	public Map<String, Integer> getBypara(){
		Map<String,Integer> goods=new HashMap<String,Integer>();
		goods.put("Shoes", 400);
        goods.put("T-shirt", 200);
        goods.put("Doll", 500);
        goods.put("code", 200);
		return goods;
	}
//	public Map<String, Integer> getBypara(@RequestParam Integer goodsId){
//		
//		Map<String,Integer> goods=new HashMap<String,Integer>();
//		goods.put("Shoes", 400);
//        goods.put("T-shirt", 200);
//        goods.put("Doll", 500);
//		return goods;
//	}

}