package clients.createEmployeeDetails;

import clients.createEmployeeDetails.request.CreateEmployeeDetailsRequest;
import clients.createEmployeeDetails.response.CreateEmployeeDetailsResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;

public class CreateEmployeeDetailsClient {


    public CreateEmployeeDetailsResponse createEmployee(CreateEmployeeDetailsRequest createEmployeeDetailsRequest) {


        String url = String.format("%s/create", SampleApiProperties.baseUrl);

        Response response = given()
                .when()
                .contentType(ContentType.JSON)
                .body(createEmployeeDetailsRequest)
                .post(url);

        CreateEmployeeDetailsResponse createEmployeeDetailsResponse = response.as(CreateEmployeeDetailsResponse.class);
        createEmployeeDetailsResponse.setHttpStatusCode(response.getStatusCode());
        return createEmployeeDetailsResponse;

    }
}

