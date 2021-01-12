package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.List;

class Testing {
	private List<String> listTitles;

	/**
	 * @return the listTitles
	 */
	public List<String> getListTitles() {
		//return listTitles;
		return new ArrayList<String>(this.listTitles); 
	}

	/**
	 * @param listTitles
	 *            the listTitles to set
	 */
	public void setListTitles(List<String> listTitles) {
		//this.listTitles = listTitles;
		this.listTitles = new ArrayList<String>(listTitles);
	}

}

public class GettersSettersExample3 {

	public static void main(String[] args) {
		Testing t=new Testing();
		List<String> t1=new ArrayList<String>();
		t1.add("A");
		t1.add("B");
		t1.add("c");
		t.setListTitles(t1);
		System.out.println(t.getListTitles());
		List<String> t2 = t.getListTitles();
		t2.set(0, "New Value");
		System.out.println(t2);
	}

}
