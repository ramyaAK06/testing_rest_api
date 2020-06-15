package clients.updateEmployeeDetails;

import clients.updateEmployeeDetails.request.UpdateEmployeeDetailsRequest;
import clients.updateEmployeeDetails.response.UpdateEmployeeDetailsResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;

public class UpdateEmployeeDetailsClient {

    public UpdateEmployeeDetailsResponse update(UpdateEmployeeDetailsRequest updateEmployeeDetailsRequest, int id) {


        String url = String.format("%s/update/%s", SampleApiProperties.baseUrl, id);

        Response response = given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .when()
                .contentType(ContentType.JSON)
                .body(updateEmployeeDetailsRequest)
                .put(url);

        UpdateEmployeeDetailsResponse updateEmployeeDetailsResponse = response.as(UpdateEmployeeDetailsResponse.class);
        updateEmployeeDetailsResponse.setHttpStatusCode(response.getStatusCode());
        return updateEmployeeDetailsResponse;

    }
}
