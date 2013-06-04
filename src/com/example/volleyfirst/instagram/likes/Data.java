package com.example.volleyfirst.instagram.likes;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Data {
	public String username;
	public String profile_picture;
	public String id;
	public String full_name;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
