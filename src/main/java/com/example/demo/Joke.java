package com.example.demo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Joke {
	private ArrayList categories;
	private String created_at;
	private String icon_url;
	private String id;
	private String updated_at;
	private String url;
	private String value;
}
