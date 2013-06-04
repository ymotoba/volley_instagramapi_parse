package com.example.volleyfirst.instagram;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.example.volleyfirst.instagram.caption.Caption;
import com.example.volleyfirst.instagram.comments.Comments;
import com.example.volleyfirst.instagram.images.Images;
import com.example.volleyfirst.instagram.likes.Likes;
import com.example.volleyfirst.instagram.users_in_photo.UsersInPhoto;

public class Data {

	public String attribution;
	public ArrayList<String> tags;
	public Location location;
	public Comments comments;
	public String filter;
	public String created_time;
	public String link;
	public Likes likes;
	public Images images;
	public ArrayList<UsersInPhoto> users_in_photo;
	public Caption caption;
	public String type;
	public String id;
	public User user;
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
