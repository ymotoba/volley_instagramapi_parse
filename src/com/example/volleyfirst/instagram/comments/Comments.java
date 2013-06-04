package com.example.volleyfirst.instagram.comments;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Comments {
	public String count;
	public ArrayList<Data> data;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
