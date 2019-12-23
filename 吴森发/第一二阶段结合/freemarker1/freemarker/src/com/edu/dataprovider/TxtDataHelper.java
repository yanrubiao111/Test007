package com.edu.dataprovider;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxtDataHelper {
	public static List<Map<String, String>>  getDataList(String filePath){
        List<Map<String, String>> list=new ArrayList<Map<String, String>>();;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(inputStreamReader);
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                Map<String, String> map = new HashMap<>();
                String data1=line.split(",")[0];
                String data2=line.split(",")[1];
                String data3=line.split(",")[2];
                String data4=line.split(",")[3];
                String data5=line.split(",")[4];
                map.put("name",data1);
                map.put("abbr",data2);
                map.put("code",data3);
                map.put("login",data4);
                map.put("category",data5);
                list.add(map);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
}
