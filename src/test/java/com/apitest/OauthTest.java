package com.apitest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class OauthTest {

	static String accessCode;
	public static WebDriver driver;
	public static String code;

	// author
	/*
	 * here we are testing OAUT2 api so we need to get the code using api which is
	 * then need to be moved to another api as parameter then providing the code we
	 * get access code which is then transafered to real api of getting details
	 */

	public static void main(String[] args) {

		selstrt();
		codegetParse();
		GetAcessCode();
		GetcourseDetail();

	}

	public static void codegetParse() {

		/*
		 * driver.findElement(By.xpath("(//div[@class = 'Xb9hP']//*)")).click();
		 * driver.findElement(By.xpath("(//div[@class = 'Xb9hP']//*)")).sendKeys(
		 * "vishnucoolmam@gmail.com");
		 * driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")) .click();
		 * //driver.findElement(By.xpath("(//div[@id='password'])")).sendKeys("Vis@8015"
		 * ); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String url
		 * = driver.getCurrentUrl();
		 * 
		 * System.out.println(url);
		 */
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AY0e-g6BUiYpoXybDHQo07kUtcyAFY_HWU3ohLFgqt2A33wMpvSx4kWQP5ollDAn1gvpCg&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#";
		String partcode = url.split("code=")[1];
		code = partcode.split("&scope")[0];
		System.out.println(code);
	}

	public static void selstrt() {// starting chrome selenium

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&State=vishjdfe");

	}

	public static void GetcourseDetail() {// getting corse from api
		RestAssured.baseURI = "";
		String resp = given().queryParam("access_token", "accessCode").when().log().all()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(resp);

	}

	public static void GetAcessCode() {// getting access code
		// urlencodingenabled is set to false for not converting special characters as
		// resassured performs it
		String accessCodeResp1 = given().urlEncodingEnabled(false).queryParams("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when().log().all()
				.get("https://www.googleapis.com/oauth2/v4/token").asString();
		System.out.println(accessCodeResp1);
		JsonPath js = new JsonPath(accessCodeResp1);
		accessCode = js.getString("access_token");
	}
}
