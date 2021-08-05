package Vowel_task;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.*;

public class VowelTasks {
		
		public static void main(String[] args) {
			String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
			System.out.println("Map with vowel count : " +arrangeTheVowels(s));
			
		}
		
		
		public static String arrangeTheVowels(String s) {
			Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

			String[] str = s.split(" ");
			
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				count = 0;
				for (int j = 0; j < str[i].length(); j++) {
					if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
						count++;
					}
				}
				if(map.containsKey(count)) {
					String temp = map.get(count);
					String rev = new StringBuilder(str[i]).reverse().toString();
					temp = temp + " " + rev;
					map.put(count, temp);
				} else {
					map.put(count, str[i]);
				}
			}
			
			System.out.println("Map :"+map);
			
			StringBuilder sb=new StringBuilder();
			for(Entry<Integer, String> e:map.entrySet()) {
				sb.append(e.getValue()).append(" ");
			}
			return sb.toString().trim();
		}
		

	}
