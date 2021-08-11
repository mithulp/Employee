package org.sample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SettoMap {

	
	
	public static void main(String[] args) {
		
		
		Set<Integer> s = new LinkedHashSet<>();
		
		
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		Map<Integer,Integer> mp = new LinkedHashMap<>();
		
		int m = 1;
		for (Integer x : s) {
			mp.put(m, x);
			m=m+1;
			
			
		}
		
		
		
		System.out.println(mp);
		
		
		
		
		
		
		
		
		
		
	}
}
