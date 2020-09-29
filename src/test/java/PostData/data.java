package PostData;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class data {
	
	@Test(priority = 1)
	public void test1()
	{
		RequestSpecification request= RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json= new JSONObject();
		json.put("name", "shubham");
		json.put("job", "Tester");
		
		request.body(json.toJSONString());
		request.post("https://reqres.in/api/users");
		System.out.println("This is Post Request");
	}

}
