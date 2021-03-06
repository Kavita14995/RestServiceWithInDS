package com.example.RestServiceWithInDS;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class URLService {

	private static Map<String,Integer> urlMap= new HashMap();
	private static Map<Integer, Integer> countMap = new HashMap();
	
	
	
	public static String storeUrl(String url) {
		if(urlMap.containsKey(url.toLowerCase()) ) {
			return "URL already stored";
		}
		else if(!url.equals(" ")){
			urlMap.put(url.toLowerCase(), url.hashCode());
			countMap.put(urlMap.get(url.toLowerCase()), 0);
			return "URL successfully inserted with count 0";
		}
		else {
			return "Please enter url to store";
		}
	}
	
	public static String getUrlKey(String url) {
		if(urlMap.containsKey(url.toLowerCase()) ) {
			countMap.put(urlMap.get(url.toLowerCase()),urlMap.get(url.toLowerCase())+1);
			return urlMap.get(url).toString();
		}
		else if(!url.equals(" ")){
			return "URL not available";
		}
		else {
			return "Please enter url to get key";
		}
	}
	
	
	
}
