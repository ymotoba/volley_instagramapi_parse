package com.example.volleyfirst.instagram.users_in_photo;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Position {
	public String x;
	public String y;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
