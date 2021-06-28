package com.apitest;

import org.testng.annotations.Test;

import com.Payload.Payloads;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.DataProviders;

import static io.restassured.RestAssured.*;

public class DynamicBooksearchApiTest extends DataProviders {

	static String baseUri = "http://216.10.245.166";
	static String endUri = "Library/Addbook.php";
	static String Id;

	@Test(dataProvider = "getdata")
	public void Addbuk(String bookName, String isbN, String aislE, String authorName) {

		RestAssured.baseURI = baseUri;
		String resp = given().header("Content-Type", "application/json")
				.body(Payloads.addBukApi(bookName, isbN, aislE, authorName)).when().post(endUri).then().assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath js = ResusableMet.RawToJson(resp);
		Id = js.get("ID");
		System.out.println("ID for new book recorderd "+Id);

	}
}
