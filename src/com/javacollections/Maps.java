package com.javacollections;
import java.util.HashMap;
import java.util.Map;

public class Maps {

	public  static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(075,"Baby");
		map.put(077,"pavi");
		map.put(073,"Devi"); 
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}


	}

}
