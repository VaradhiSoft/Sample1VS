package com.varadhisoft.java.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable<Emp> {
	private int eno;
	private String name;

	Emp(int eno,String name) {
		this.eno = eno;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Emp e) {
		return new Integer(this.eno).compareTo(new Integer(e.eno));
		//return this.name.compareTo(e.getName());
	}

}

public class ComparableEx {

	public static void main(String[] args) {
		List<Emp> el = new ArrayList<Emp>();

		el.add(new Emp(1007,"Seenu"));

		el.add(new Emp(1005,"Chinna"));
		
		el.add(new Emp(1003,"Kumar"));

		Collections.sort(el);

		for (Emp e : el) {
			System.out.println(e.getName());
		}
	}
}
