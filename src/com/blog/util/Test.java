package com.blog.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class Test {

	public static int a = 111;
	public static void main(String[] args) {
		/*String proTypeArr[] = new String[]{};
		String s = "热门车型,特价车,海外定制,新车上市";
		proTypeArr = s.split(",");
		System.out.println(proTypeArr[1]);
		System.out.println("+++" + "".split(",")[0]);*/
//		Runtime rn = Runtime.getRuntime();
//		String command = "notepad";
//		try {
//			rn.exec(command);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try {
			System.out.println(java.net.URLDecoder.decode("%E4%B8%AD%E5%9B%BD","UTF-8"));
			System.out.println(java.net.URLEncoder.encode("分公司管理员","UTF-8"));
			File file = new File("D:\\log.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			long time = file.lastModified();
			String fileName = String.valueOf(time);
			File newFile = new File("D:\\" + fileName + ".txt");
			if(!newFile.exists()){
				newFile.createNewFile();
			}
			String s = "[{\"areaName\":\"\",\"foodName\":\"米饭\",\"unit\":\"碗\",\"addType\":\"FIX\"}]";
			s = s.substring(2, s.length()-2);
			System.out.println(s);
			System.out.println(s.split(":").length);
			List<String> list = new ArrayList<String>();
			List<String> list1 = null;
			System.out.println(list.isEmpty());
			list = list1;
			System.out.println(list == null || list.size() ==0 );
			System.out.println(list.size());
//			;
//			FileOutputStream fos = new FileOutputStream(file);
//			byte[] b  = "122".getBytes();
//			fos.write(b);
//			fos.close();
//			System.out.println(file.getName());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a + 111);
		a =a + 111;
		System.out.println(a + 111);
	}
	/*public static void main(String[] args) {
		String str="<p>fda</p>";
		System.out.println(StringEscapeUtils.escapeHtml(str));
		//存储结构 ： 河南理工大学 -- 计算机学院 --- 软件工程 -- java1003---XXX
		Map<String,Object> forthLevelMap = new HashMap<String, Object>();
		List<Map<String,Object>> forthLevelList = new ArrayList<Map<String,Object>>();
		forthLevelMap.put("0327", "一鸣马");
		forthLevelMap.put("0328", "逗比帅");
		forthLevelMap.put("0319", "土豪磊");
		forthLevelMap.put("0320", "傻逼王");
		forthLevelList.add(forthLevelMap);
		Map<String,List<Map<String,Object>>> thirdLevelMap = new HashMap<String, List<Map<String,Object>>>();
		thirdLevelMap.put("JAVA1003",forthLevelList);
		List<Map<String,List<Map<String,Object>>>> thirdLevelList = new ArrayList<Map<String,List<Map<String,Object>>>>();
		thirdLevelList.add(thirdLevelMap);
		Map<String,List<Map<String,List<Map<String,Object>>>>> secondLevelMap = new HashMap<String, List<Map<String,List<Map<String,Object>>>>>();
		secondLevelMap.put("河南理工计算机科学与技术学院", thirdLevelList);
		List<Map<String,List<Map<String,List<Map<String,Object>>>>>> secondLevelList = new ArrayList<Map<String,List<Map<String,List<Map<String,Object>>>>>>();
		for(Map<String,List<Map<String,List<Map<String,Object>>>>> map : secondLevelList){
		}
	}*/
}
