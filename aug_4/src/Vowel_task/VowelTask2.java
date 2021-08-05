package Vowel_task;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class VowelTask2 {

	public static void main(String[] args) {
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
        System.out.println("Map with vowel unique vowel count: "+sortUniqueVowels(s));
	}
	
	public static String sortUniqueVowels(String s)
	{
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		Set<Character> set = new HashSet<>();
		
		
		String[] str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			set.clear();
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
					set.add(str[i].charAt(j));
				} 
			}
			if(map.containsKey(set.size())) {
				String temp = map.get(set.size());
				temp = temp + " " + str[i];
				map.put(set.size(), temp);
			} else {
				map.put(set.size(), str[i]);
			}
		}
		System.out.println("Map: "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
		
	}

}
