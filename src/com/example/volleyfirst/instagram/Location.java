package com.example.volleyfirst.instagram;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Location {

	public String latitude;
	public String longitude;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
