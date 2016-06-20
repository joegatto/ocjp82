package br.com.gatto.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTests {
	public static void main(String[] args) {

		System.out.println("*************** Using HashMap ***************");
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");
		for (String key : map.keySet()) {
			System.out.print(key + ", ");
		}

		System.out.println("\n*************** Using TreeMap ***************");
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meat");
		map2.put("giraffe", "leaf");
		food = map2.get("koala");
		for (String key : map2.keySet()) {
			System.out.print(key + ", ");
		}

		// System.out.println(map.contains("lion"));
		System.out.println(map.containsKey("lion"));
		System.out.println(map.containsValue("lion"));
		System.out.println(map.size());
	}
}
