package testAIO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.Object;

public class AioEnableWorkflowGet {

	@Test
	public void getEnableWorkflowAPI() throws IOException {
		RestAssured.baseURI = "https://api-staging.automate.io";
		RestAssured.basePath = "/auth";

		Response resp = given().header("Content-Type", "application/json").header("Accept", "application/json")
				.header("User-Agent",
						"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")
				.log().all().when().get("/logout").then().statusCode(200).log().all().extract()
				.response();

		System.out.println(resp.prettyPrint());

	}

}
