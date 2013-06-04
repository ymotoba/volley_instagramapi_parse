package com.example.volleyfirst.instagram.caption;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Caption {
	public String created_time;
	public String text;
	public From from;
	public String id;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
