package com.apitest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.Payload.Payloads;

public class basics {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com" ;
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payloads.Addplace()).when().post("/maps/api/place/add/json?key =qaclick123").then().assertThat().
		         statusCode(200).log().all().body("scope", equalTo("APP"));
		        
	}
}
