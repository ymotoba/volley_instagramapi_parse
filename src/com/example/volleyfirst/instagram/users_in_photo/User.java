package com.example.volleyfirst.instagram.users_in_photo;

import org.apache.commons.lang.builder.ToStringBuilder;

public class User {
	public String username;
	public String profile_picture;
	public String id;
	public String full_name;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
