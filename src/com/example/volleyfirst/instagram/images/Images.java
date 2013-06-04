package com.example.volleyfirst.instagram.images;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Images {
	public LowResolution low_resolution;
	public Thumbnail thumbnail;
	public StandardResolution standard_resolution;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
