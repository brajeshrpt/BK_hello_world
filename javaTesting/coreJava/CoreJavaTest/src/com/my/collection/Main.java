package com.my.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class HDTV1 {
	private int size;
	private String brand;
	private int height;
 
	public HDTV1(int size, String brand, int height) {
		this.size = size;
		this.brand = brand;
		this.height = height;
	}
 
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
 
class SizeComparator implements Comparator<HDTV1> {
	@Override
	public int compare(HDTV1 tv1, HDTV1 tv2) {
		int tv1Size = tv1.getHeight();
		int tv2Size = tv2.getHeight();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
}
 
public class Main {
	public static void main(String[] args) {
		HDTV1 tv1 = new HDTV1(55, "Samsung",66);
		HDTV1 tv2 = new HDTV1(6, "Sony", 6);
		HDTV1 tv3 = new HDTV1(42, "Panasonic", 7);
 
		ArrayList<HDTV1> al = new ArrayList<HDTV1>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTV1 a : al) {
			System.out.println(a.getBrand());
		}
	}
}

