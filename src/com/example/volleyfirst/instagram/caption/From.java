package com.example.volleyfirst.instagram.caption;

import org.apache.commons.lang.builder.ToStringBuilder;

public class From {
	public String username;
	public String profile_picture;
	public String id;
	public String full_name;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
