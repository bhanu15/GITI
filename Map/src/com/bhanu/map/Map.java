package com.bhanu.map;

/**
 * this is map implementation 
 * @author bhanu
 *
 * @param <K>
 * @param <V>
 */

public class Map<K , V > {
	Entry<K, V> head;

	static class Entry<K , V > {
		K key;
		V value;
		Entry<K, V> next;
		Comparable<K> keyComparable;
		Comparable<V> valueComparable;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
			next = null;
			keyComparable = (Comparable<K>) key;
			valueComparable = (Comparable<V>) value;
		}

		public K getKey(V value) {
			return key;
		}

		public V getValue(K key) {
			return value;
		}

		public String toString() {
			return "Key : " + key + " value : " + value;
		}

		public int compareKey(K key) {
			System.out.println("In key compare");
			return keyComparable.compareTo(key);
		}

		public int compareValue(V value) {
			System.out.println("In key compare");
			return valueComparable.compareTo(value);
		}
	}
	
	public int put(K key , V value) {
		Entry<K, V> temp = head;
		Entry<K, V> entry = new Entry(key, value);
		if(temp == null){
			temp = new Entry< K, V>(key, value);
			this.head = temp;
			return 1;
		}
		if(containsKey(key) ){
			return 0;
		}else{
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Entry<K, V>(key, value);
		}
		
		return 1;
	}
	
	public void dispaly(){
		Entry<K, V> entry = head;
		while(entry != null){
			System.out.println(entry);
			entry = entry.next;
		}
		
	}
	
	public void display(Entry<K, V> entry){
		
	}
	public boolean containsKey(K key){
		Entry<K, V> temp = head;
		while(temp != null){
			if(temp.compareKey(key) == 0){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		Map.Entry<String, Student> entry = new Map.Entry<String, Student>("1", new Student(100));
		System.out.println(entry.getValue("1"));
		System.out.println(entry);
		Map.Entry<String, Student> entry1 = new Map.Entry<String, Student>("10", new Student(1000));
		System.out.println(entry.compareKey(entry1.key));
		
		Map<String , String > map = new Map<>();
		map.put("1", "a");
		map.put("2", "a");
		map.put("3", "a");
		map.put("14", "a");
		map.put("100", "a");
		map.put("5", "a");
		map.dispaly();
		System.out.println("adding again");
		map.put("1", "a");
		map.put("2", "a");
		map.put("3", "a");
		map.put("14", "a");
		map.put("100", "a");
		map.put("5", "a");
		map.dispaly();
		System.out.println("Adding again");
		map.dispaly();
		
		Map<Integer , Map<String , Integer>> map1 ;
	}	
}
