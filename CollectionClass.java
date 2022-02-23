package com.pragiti;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionClass {
	//CollectionInterface c=new CollectionInterface();  //we can't create object of Interface
       // List l=new List(); //we can't create object of Interface
	//Set s= new Set();     //we can't create object of Interface
	void mapMethod() {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("Alam", 111);
		map.put("neeraj", 112);
		System.out.println(map);
	}
	void setMethods() {
		Set<Emp> set=new HashSet<Emp>(); // UpCasting
		Emp e1=new Emp(222,"Wakeel");
		Emp e2=new Emp(333,"Asif");
		set.add(e1);
		set.add(e2);
		System.out.println(set);
		TreeSet<Emp> tSet=new TreeSet<Emp>();
		//tSet.add(null); throws NullPointerException
		tSet.addAll(set);  // Emp class implements Comparable interface
		tSet.add(new Emp(444,"Ratan"));
		//tSet.add(e1);
		System.out.println(tSet); // Data in Descending order
	}
	public static void main(String[] args){
	ArrayList<String> arrayList= new ArrayList<String>(16); // Importance of generic
	arrayList.add("alam");
	arrayList.add("Ravi");
	arrayList.add("123");
	System.out.println(arrayList);
	//arrayList.remove(1);
	arrayList.set(2, "raju");
	System.out.println(arrayList);
	LinkedList<String> linkedList=new LinkedList<String>();
	ConcurrentHashMap<String, String> conHashMap=new ConcurrentHashMap<String,String>();
	Iterator<String> iterator = arrayList.iterator();
	while(iterator.hasNext()) {
	String str=iterator.next();
	System.out.println(str);
	}
	ListIterator<String> lst=arrayList.listIterator();
	while(lst.hasNext()) {
		String srt1=lst.next();
		System.out.println(srt1);
		
	}
	while(lst.hasPrevious()){
		String s1=lst.previous();
		System.out.println(s1);
	}
	CollectionClass cal=new CollectionClass();
	cal.mapMethod();
	cal.setMethods();
}}
