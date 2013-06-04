package com.example.volleyfirst;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.example.volleyfirst.instagram.Data;
import com.example.volleyfirst.instagram.Meta;

public class InstagramResponse {

	public Meta meta;
	public ArrayList<Data> data;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
