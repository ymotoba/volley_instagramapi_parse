package com.example.volleyfirst.instagram;

import org.apache.commons.lang.builder.ToStringBuilder;

public class User {
	public String username;
	public String website;
	public String profile_picture;
	public String full_name;
	public String bio;
	public String id;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
