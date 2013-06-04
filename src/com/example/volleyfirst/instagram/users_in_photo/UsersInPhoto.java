package com.example.volleyfirst.instagram.users_in_photo;

import org.apache.commons.lang.builder.ToStringBuilder;

public class UsersInPhoto {
	public Position position;
	public User user;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
