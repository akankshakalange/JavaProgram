package com.edu;

import java.util.HashMap;
import java.util.Map;

public class Source {
	public static Map<Character,Integer> countChars(char arr[]) {
		Map<Character,Integer> charHashMap=new HashMap<Character,Integer>();
		for(char c:arr) {
			//System.out.println(c);
			if(charHashMap.containsKey(c)) {
				//incrementvalue
				charHashMap.put(c, charHashMap.get(c)+1);
			}
			else {
				//char not exists in hashmap
				//put the char and value as
				charHashMap.put(c, 1);
			}
		}
		return charHashMap;
		
	}
	public static void main(String[] args) {
		String s="asdfas";
		char arr[]=s.toCharArray();
		//char arr[]= {'a','f','c','d','a','c'};
		Map<Character,Integer> cnt=countChars(arr);
		System.out.println(cnt);
	}

}
