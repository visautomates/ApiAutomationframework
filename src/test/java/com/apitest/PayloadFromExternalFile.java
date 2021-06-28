package com.apitest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.Payload.Payloads;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PayloadFromExternalFile extends AddUpdateCheck{
	
	@Test//Value from Files are converted to bytes then to string using syntax
	public void addpayloadfromFile() throws IOException {
		RestAssured.baseURI = startUrl;
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("D:\\Viz\\carrer related\\API Testing\\new 1.json")))).
						when().post(endUrl).then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);

		JsonPath jp = new JsonPath(response);// Json Parsing
		place = jp.get("place_id");
		System.out.println(place);
	}

}
