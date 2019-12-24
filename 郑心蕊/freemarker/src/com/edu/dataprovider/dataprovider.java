package com.edu.dataprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TxtDataProvider {
	
	public static Object[][] getTestData(String filepath) throws IOException {
		List<Object[]> records = new ArrayList<Object[]>();
		String record;
		BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF-8"));
		while ((record = file.readLine()) != null) {
			String fileds[] = record.split(",");
			records.add(fileds);
		}
		file.close();
		// 定义函数返回值，即Object[][]
		// 将存储测试数据的list转换为一个Object的二维数组
		Object[][] result = new Object[(records.size())][];
		for (int i = 0; i <records.size(); i++) {
			result[i] = records.get(i);
		}
		return result;
	}

	
	public static Object[][] getTxtUser(String fileName) throws IOException {
		
		List<String> dataList = new ArrayList<String>();
	
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr= new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);
		int cols=reader.readLine().split("\t").length;
		
		String readData;
		while((readData=reader.readLine())!=null) {
			dataList.add(readData);
		}
		
		Object [][] result = new Object[dataList.size()][cols];
		String [] arrays;
		for(int i=0;i<dataList.size();i++) {
			arrays=dataList.get(i).split("\t");
			for(int j=0;j<cols;j++)
				result[i][j]=arrays[j];
		}
		return result;
	}
	}
