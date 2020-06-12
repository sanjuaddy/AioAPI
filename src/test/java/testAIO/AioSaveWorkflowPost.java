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

public class AioSaveWorkflowPost {

	@Test
	public void postSaveWorkflowAPI() throws IOException {
		RestAssured.baseURI = "https://api-staging.automate.io";
		
		String payLoad = "{\r\n    \"actions\": [\r\n        {\r\n            \"id\": \"aio_w_iihrwjap4dn6_5e70bfa081ac090620d51fbb_send_mail\",\r\n            \"params\": [\r\n                {\r\n                    \"id\": \"subject\",\r\n                    \"inputType\": \"input\",\r\n                    \"data\": {\r\n                        \"value\": \"[[{\\\"activityId\\\":\\\"aio_w_mbs1q4ex1vue_56bdb354f3e0ce2491d6619b_every-hour\\\",\\\"appId\\\":\\\"timer\\\",\\\"fieldId\\\":\\\"currentTime\\\",\\\"fieldName\\\":\\\"Current Time\\\"}]]\"\r\n                    },\r\n                    \"datatype\": \"string\",\r\n                    \"required\": true,\r\n                    \"value\": \"[[{\\\"activityId\\\":\\\"aio_w_mbs1q4ex1vue_56bdb354f3e0ce2491d6619b_every-hour\\\",\\\"appId\\\":\\\"timer\\\",\\\"fieldId\\\":\\\"currentTime\\\",\\\"fieldName\\\":\\\"Current Time\\\"}]]\"\r\n                },\r\n                {\r\n                    \"id\": \"contentType\",\r\n                    \"inputType\": \"select\",\r\n                    \"data\": {\r\n                        \"isCustom\": false,\r\n                        \"name\": \"Plain Text\",\r\n                        \"value\": \"plain\"\r\n                    },\r\n                    \"datatype\": \"string\",\r\n                    \"required\": true,\r\n                    \"value\": \"plain\"\r\n                },\r\n                {\r\n                    \"id\": \"email_body\",\r\n                    \"inputType\": \"input\",\r\n                    \"data\": {\r\n                        \"value\": \"dsc xzdvf\"\r\n                    },\r\n                    \"datatype\": \"string\",\r\n                    \"required\": true,\r\n                    \"value\": \"dsc xzdvf\"\r\n                },\r\n                {\r\n                    \"id\": \"to\",\r\n                    \"inputType\": \"multiinput\",\r\n                    \"data\": [\r\n                        {\r\n                            \"id\": \"0\",\r\n                            \"value\": \"[[{\\\"activityId\\\":\\\"aio_w_mbs1q4ex1vue_56bdb354f3e0ce2491d6619b_every-hour\\\",\\\"appId\\\":\\\"timer\\\",\\\"fieldId\\\":\\\"currentTime\\\",\\\"fieldName\\\":\\\"Current Time\\\"}]]\"\r\n                        }\r\n                    ],\r\n                    \"datatype\": \"string\",\r\n                    \"required\": false\r\n                }\r\n            ],\r\n            \"appId\": \"56bdb323f3e0ce2491d66197\",\r\n            \"userappId\": \"5e70bfa081ac090620d51fbb\",\r\n            \"parsedSampleData\": [],\r\n            \"sampleData\": {},\r\n            \"actionId\": \"send_mail\",\r\n            \"dynamicResponseFields\": []\r\n        }\r\n    ],\r\n    \"name\": \"Timer - Every Hour\",\r\n    \"status\": \"disabled\",\r\n    \"trigger\": {\r\n        \"id\": \"aio_w_mbs1q4ex1vue_56bdb354f3e0ce2491d6619b_every-hour\",\r\n        \"params\": [\r\n            {\r\n                \"data\": {\r\n                    \"value\": \"Yes\"\r\n                },\r\n                \"dataType\": \"string\",\r\n                \"id\": \"triggerOnWeekends\",\r\n                \"inputType\": \"select\",\r\n                \"datatype\": \"string\",\r\n                \"required\": false,\r\n                \"value\": \"Yes\"\r\n            }\r\n        ],\r\n        \"appId\": \"56bdb354f3e0ce2491d6619b\",\r\n        \"userappId\": \"56bdb354f3e0ce2491d6619b\",\r\n        \"parsedSampleData\": [],\r\n        \"sampleData\": {},\r\n        \"triggerId\": \"every-hour\",\r\n        \"dynamicResponseFields\": []\r\n    },\r\n    \"version\": \"1.1\",\r\n    \"webhookStatus\": \"disabled\"\r\n}";

		Response resp = given().header("Content-Type", "application/json").header("Accept", "application/json")
				.header("User-Agent",
						"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")
				.body(payLoad).log().all().when().post("/workflows").then().statusCode(200).log().all().extract()
				.response();

		System.out.println(resp.prettyPrint());

	}

}
