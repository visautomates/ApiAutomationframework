package com.Payload;

public class Payloads {
	/*
	 * static String startUrl = "https://rahulshettyacademy.com"; static String
	 * endUrl = "maps/api/place/add/json"; static String updateEndUrl =
	 * "maps/api/place/update/json"; static String
	 * getEndUr="/maps/api/place/get/json"; static String place; static String
	 * newAddress ="east coast road,india";
	 */ // improve this script 
	
	public static  String Addplace()	{
		
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n";
}
	
	public static String Mockjson()	{
		
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";

		
		
		}
	public static  String addBukApi(String bookName,String isbN,String aislE , String authorName) {
		String paylod= "{\r\n"
				+ "\r\n"
				+ "\"name\":\""+bookName+"\",\r\n"
				+ "\"isbn\":\""+isbN+"\",\r\n"
				+ "\"aisle\":\""+aislE+"\",\r\n"
				+ "\"author\":\""+authorName+"\"\r\n"
				+ "}\r\n"
				+ "";
				return paylod;
	
/*
 * public static String UpDate(){ return "{\r\n" + "\"place_id\":\"" + place +
 * "\"," + "\r\n" + "\"address\":\""+newAddress+"\",\r\n" +
 * "\"key\":\"qaclick123\"\r\n" + "}\r\n";
 * 
 * }
 */
	
	}
}
	
