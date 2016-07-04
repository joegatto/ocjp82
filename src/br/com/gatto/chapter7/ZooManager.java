package br.com.gatto.chapter7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
	private Map<String, Object> foodData = new ConcurrentHashMap<>();

	public void put(String key, String value) {
		foodData.put(key, value);
	}

	public Object get(String key) {
		return foodData.get(key);
	}
}
