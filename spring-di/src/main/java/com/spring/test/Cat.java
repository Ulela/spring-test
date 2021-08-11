package com.spring.test;

import lombok.ToString;

/**
 * @author: chenf
 * @Date: 2021/8/11 11:27
 */
@ToString
public class Cat {
	private String name;
	private Person master;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getMaster() {
		return master;
	}

	public void setMaster(Person master) {
		this.master = master;
	}
}
