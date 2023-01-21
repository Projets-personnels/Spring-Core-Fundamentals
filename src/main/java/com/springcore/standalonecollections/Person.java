package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStr;

	public Map<String, Integer> getFeeStr() {
		return feeStr;
	}

	public void setFeeStr(Map<String, Integer> feeStr) {
		this.feeStr = feeStr;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStr=" + feeStr + "]";
	}

	

	
}
