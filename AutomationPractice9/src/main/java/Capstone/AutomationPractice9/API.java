package Capstone.AutomationPractice9;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.openqa.selenium.remote.Response;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForGivenType;

import org.testng.Assert;
import org.testng.asserts.*;
public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		io.restassured.response.Response io = get("https://reqres.in/api/users?page=2");
		io.prettyPrint();
		int statuses =io.getStatusCode();
		System.out.println(statuses);
		Assert.assertEquals(statuses, 200);
		ResponseBody body = io.getBody();
		String converttostring = body.asString();
		System.out.println(converttostring);
		Assert.assertEquals(converttostring.contains("George"),true,"Name is not displayin");
		Post();
	}
	public static void Post() {
		File ot = new File(System.getProperty("user.dir")+"\\House.json");
	io.restassured.response.Response us = given().contentType(ContentType.JSON).body(ot).post("https://reqres.in/api/users");
	us.prettyPrint();
	System.out.println(us.getStatusCode());
		
		
		
		
	
	}

	}


