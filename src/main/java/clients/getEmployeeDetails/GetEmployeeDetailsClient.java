package clients.getEmployeeDetails;

import clients.getEmployeeDetails.response.GetEmployeeDetailsResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;


public class GetEmployeeDetailsClient {


    String url = String.format("%s/employees", SampleApiProperties.baseUrl);

    public GetEmployeeDetailsResponse getEmployeeDetails() {

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(url);

        GetEmployeeDetailsResponse getEmployeeDetailsResponse = new GetEmployeeDetailsResponse();
        getEmployeeDetailsResponse.setHttpStatusCode(response.getStatusCode());
        return getEmployeeDetailsResponse;

    }
}
