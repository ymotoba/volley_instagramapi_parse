package com.example.volleyfirst.instagram.likes;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Likes {

	public String count;
	public ArrayList<Data> data;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
