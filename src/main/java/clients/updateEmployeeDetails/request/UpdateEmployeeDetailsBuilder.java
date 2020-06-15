package clients.updateEmployeeDetails.request;

public class UpdateEmployeeDetailsBuilder {

    public UpdateEmployeeDetailsRequest updateEmployeeDetailsRequest;


    public UpdateEmployeeDetailsBuilder() {
        updateEmployeeDetailsRequest = new UpdateEmployeeDetailsRequest();
        updateEmployeeDetailsRequest.setAge("23");
        updateEmployeeDetailsRequest.setName("test1");
        updateEmployeeDetailsRequest.setSalary("1123");
    }

    public UpdateEmployeeDetailsRequest build() {
        return updateEmployeeDetailsRequest;
    }
}
