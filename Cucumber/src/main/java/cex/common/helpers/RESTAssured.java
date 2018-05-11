package cex.common.helpers;

//import io.restassured.RestAssured;
//import io.restassured.http.Method;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class RESTAssured {

	private static String responseBody;

	public static String GETRESTVALUE(String URI) {

		try {

			// RestAssured.baseURI = URI;
			// RequestSpecification httpRequest = RestAssured.given();

			// Response response = httpRequest.request(Method.GET);

			// responseBody = response.getBody().asString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseBody;

	}

	public static String POSTRESTVALUE(String URI) {
		return URI;

	}

}
