package com.apitest;

import org.testng.Assert;

import com.Payload.Payloads;


import io.restassured.path.json.JsonPath;

public class ComplexJsonPars {

	public static void main(String args[]) {

		JsonPath Js = new JsonPath(Payloads.Mockjson());

		System.out.println("**********1.Print No of courses returned by API***********");
		int nUmberofcourses = Js.get("courses.size()");//
		System.out.println(nUmberofcourses);

		System.out.println("***********2.Print Purchase Amount*****************");
		int purchaseAmount = Js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);

		System.out.println("**********3.Print Title of the first course*************");
		String cOurseTitle = Js.get("courses[0].title");
		System.out.println(cOurseTitle);

		System.out.println("************4.Print All course titles and their respective Prices************");
		for (int i = 0; i < nUmberofcourses; i++) {
			String courseTitleName = Js.get("courses[" + i + "].title");
			System.out.println("Titel:" + courseTitleName);
			int coursePriceName = Js.get("courses[" + i + "].price");
			System.out.println("Price:" + coursePriceName);

		}
		System.out.println("****************5.Print no of copies sold by RPA Course*************");
		for (int i = 0; i < nUmberofcourses; i++) {
			String courseTitleName = Js.get("courses[" + i + "].title");
			if (courseTitleName.equalsIgnoreCase("Selenium Python")) {
				int numBerCopies = Js.get("courses[" + i + "].copies");
				System.out.println("copies sold:" + numBerCopies);
				break;
			}
		}

		System.out.println(
				"****************6.Verify if Sum of all Course prices matches with Purchase Amount*************");
		int sum = 0;
		for (int j = 0; j < nUmberofcourses; j++) {
			int Price = Js.get("courses[" + j + "].price");
			int copies = Js.get("courses[" + j + "].copies");
			int priceOfCopies = Price * copies;
			System.out.println(priceOfCopies);
			sum = sum + priceOfCopies;

		}
		System.out.println("sum of all course sold:" + sum);
		Assert.assertEquals(sum, purchaseAmount);
		System.out.println("verification successfull");

	}
}
