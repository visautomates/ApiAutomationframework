package com.apitest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import com.Payload.Payloads;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class AddUpdateCheck {

	// ADD a new place update the new place check the place validation

	static String startUrl = "https://rahulshettyacademy.com";
	static String endUrl = "maps/api/place/add/json";
	static String updateEndUrl = "maps/api/place/update/json";
	static String getEndUr = "/maps/api/place/get/json";
	static String place;
	static String newAddress = "east coast road,india";

	public static void main(String[] args) {
		Addpl();
		
		  up(); 
		  gt();
		 
	}

	public static void Addpl() {

		RestAssured.baseURI = startUrl;
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payloads.Addplace()).when().post(endUrl).then().assertThat().statusCode(200).extract().response()
				.asString();
		System.out.println(response);

		JsonPath jp = new JsonPath(response);// Json Parsing
		place = jp.get("place_id");
		System.out.println(place);

	}

	public static void up() {

		RestAssured.baseURI = startUrl;

		given().queryParam("key", "qaclick123").header("Content-Type", "application/json").queryParam("place_id", place).body("{\r\n"
			    + "\"place_id\":\"" + place + "\","
				+ "\r\n" + "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
				.when().put(updateEndUrl).then().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated")).log().all();

	}

	public static void gt() {

		RestAssured.baseURI = startUrl;

		String Rr = given().queryParam("key", "qaclick123").queryParam("place_id", place).when().get(getEndUr).then()
				.assertThat().statusCode(200).extract().response().asString();

		//JsonPath re = new JsonPath(Rr);
		JsonPath js1 = ResusableMet.RawToJson(Rr);// creating  a reusable method 
		String Actualaddress = js1.getString("address");
		Assert.assertEquals(Actualaddress, newAddress);

		System.out.println("successfully completed the updation of new address");
	}

}
