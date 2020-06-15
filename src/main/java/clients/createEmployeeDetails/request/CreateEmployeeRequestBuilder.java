package clients.createEmployeeDetails.request;

public class CreateEmployeeRequestBuilder {

    public CreateEmployeeDetailsRequest createEmployeeDetailsRequest;


    public CreateEmployeeRequestBuilder() {
        createEmployeeDetailsRequest = new CreateEmployeeDetailsRequest();
        createEmployeeDetailsRequest.setAge("23");
        createEmployeeDetailsRequest.setName("test");
        createEmployeeDetailsRequest.setSalary("123");
    }

    public CreateEmployeeDetailsRequest build() {
        return createEmployeeDetailsRequest;
    }
}
