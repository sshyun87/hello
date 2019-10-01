package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}
	public static <O, A> boolean compareValue(Pair<O, A> s1, Pair<O, A> s2) {
		boolean bool1 = s1.getValue().equals(s2.getValue());
		return bool1;
//		if(result)
//			System.out.println("두 객체가 논리적으로 동일함.");
//		else
//			System.out.println("두 객체가 논리적으로 동일하지 않음.");

	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
		
		
	}

}
