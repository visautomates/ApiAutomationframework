package com.apitest;

import io.restassured.path.json.JsonPath;

public class ResusableMet {

	
	public static JsonPath RawToJson(String Response) {
		
		JsonPath js1 = new JsonPath(Response);
				return js1;
	}
}
