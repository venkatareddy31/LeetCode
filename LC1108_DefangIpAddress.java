package com.java.practice;

public class LC1108_DefangIpAddress {
	public String defangIPaddr(String address) {
		String target=".";
		String replace="[.]";
		String defangIp=address.replace(target,replace);
		return defangIp;
    }
}
