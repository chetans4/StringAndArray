package org.chetan.main;

import java.util.HashMap;
import java.util.Iterator;

public final class MyImmutable {

	private final String name;
	private final int age;
	private HashMap<Integer, String> map = new HashMap<>();
	
	public MyImmutable(String name, int age, HashMap<Integer, String> map){
		this.name = name;
		this.age = age;
		//mutable
//		this.map = map;
		//Immutable
		HashMap<Integer, String> tempMap=new HashMap<Integer, String>();
		Integer key;
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, map.get(key));
		}
		this.map = tempMap;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public HashMap<Integer, String> getMap() {
		return (HashMap<Integer, String>) map.clone();
	}
	
}
