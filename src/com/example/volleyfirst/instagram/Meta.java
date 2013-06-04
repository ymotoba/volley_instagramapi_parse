package com.example.volleyfirst.instagram;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Meta {
	public String code;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
