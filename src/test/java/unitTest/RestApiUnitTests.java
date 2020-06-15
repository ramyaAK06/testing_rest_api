package unitTest;

import clients.createEmployeeDetails.CreateEmployeeDetailsClient;
import clients.createEmployeeDetails.request.CreateEmployeeDetailsRequest;
import clients.createEmployeeDetails.request.CreateEmployeeRequestBuilder;
import clients.createEmployeeDetails.response.CreateEmployeeDetailsResponse;
import clients.getEmployeeDetails.GetEmployeeDetailsClient;
import clients.getEmployeeDetails.response.GetEmployeeDetailsResponse;
import clients.updateEmployeeDetails.UpdateEmployeeDetailsClient;
import clients.updateEmployeeDetails.request.UpdateEmployeeDetailsBuilder;
import clients.updateEmployeeDetails.request.UpdateEmployeeDetailsRequest;
import clients.updateEmployeeDetails.response.UpdateEmployeeDetailsResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Categories;

public class RestApiUnitTests {

    @Test(groups = {Categories.SMOKE})
    public void getEmployeeDetails() {

        GetEmployeeDetailsResponse employeeDetails = new GetEmployeeDetailsClient().getEmployeeDetails();
        Assert.assertEquals(employeeDetails.getHttpStatusCode(), 200);

    }

    @Test(groups = {Categories.SMOKE})
    public void createEmployeeAndGetDetails() {

        CreateEmployeeDetailsRequest createEmployeeDetailsRequest = new CreateEmployeeRequestBuilder().build();
        CreateEmployeeDetailsResponse createEmployeeDetailsResponse = new CreateEmployeeDetailsClient().createEmployee(createEmployeeDetailsRequest);
        Assert.assertEquals(createEmployeeDetailsResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(createEmployeeDetailsResponse.getData().getAge(), "23");
        Assert.assertEquals(createEmployeeDetailsResponse.getData().getName(), "test");
        Assert.assertEquals(createEmployeeDetailsResponse.getData().getSalary(), "123");
    }

    @Test(groups = {Categories.REGRESSION})
    public void createEmployeeUpdateDetails() {
        CreateEmployeeDetailsRequest createEmployeeDetailsRequest = new CreateEmployeeRequestBuilder().build();
        CreateEmployeeDetailsResponse createEmployeeDetailsResponse = new CreateEmployeeDetailsClient().createEmployee(createEmployeeDetailsRequest);
        Assert.assertEquals(createEmployeeDetailsResponse.getHttpStatusCode(), 200);

        UpdateEmployeeDetailsRequest updateEmployeeDetailsRequest = new UpdateEmployeeDetailsBuilder().build();
        UpdateEmployeeDetailsResponse updateEmployeeDetailsResponse = new UpdateEmployeeDetailsClient().update(updateEmployeeDetailsRequest, createEmployeeDetailsResponse.getData().getId());

        Assert.assertEquals(updateEmployeeDetailsResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(updateEmployeeDetailsResponse.getStatus(), "success");

    }
}
