package com.example.volleyfirst.instagram.comments;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Data {

	public String created_time;
	public String text;
	public From from;
	public String id;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
