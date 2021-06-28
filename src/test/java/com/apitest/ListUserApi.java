package com.apitest;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import pojo.Data;
import pojo.ListUser;

import static io.restassured.RestAssured.*;

import java.util.List;



public class ListUserApi {
	
	public static String baseurl = "https://reqres.in";
	public static String endurl = "/api/users?delay=3";

	
	public static void main(String args[]) {
		
		listuser();
		
	}
	
	public static void listuser() {
		RestAssured.baseURI = baseurl ;
		ListUser gc= given().queryParam("delay", "3").expect().defaultParser(Parser.JSON).
		when().get(endurl).as(ListUser.class);
		
		System.out.println(gc.getPage());
		
		List<Data> listvalue = gc.getData();
		
		for(int i = 0; i<listvalue.size();i++)
		{
			if(listvalue.get(i).getId().equals(1)) 
			{
				System.out.println(listvalue.get(i).getAvatar());
				System.out.println(listvalue.get(i).getEmail());
				System.out.println(listvalue.get(i).getFirst_name());
				System.out.println(listvalue.get(i).getLast_name());
			}
		}
	}
	

}
