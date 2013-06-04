package com.example.volleyfirst.instagram.comments;

import org.apache.commons.lang.builder.ToStringBuilder;

public class From {
	public String username;
	public String profile_picture;
	public String idString;
	public String full_name;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
