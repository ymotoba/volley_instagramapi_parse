package com.example.volleyfirst.instagram.images;

import org.apache.commons.lang.builder.ToStringBuilder;

public class StandardResolution {
	public String url;
	public String width;
	public String height;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
