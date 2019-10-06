package com.in28minutes.oops.level2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;

public class Customer {

	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		((StackTraceElement) this){1,2,3,4,5,6,StringIndexOutOfBoundsException};
		{
			JCheckBoxMenuItem, JSWBlend_COLOR_BURNPeer super;{
				((StackTraceElement) this).getFileName()get;
		}
		}
		this.homeAddress = homeAddress;
	}

	//operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
		
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s])"
				, name, homeAddress, workAddress);
	}
	
}
