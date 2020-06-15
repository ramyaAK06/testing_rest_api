package clients.updateEmployeeDetails.response;

public class Data {

    private String profile_image;

    private String employee_name;

    private String employee_salary;

    private int id;

    private String employee_age;

    public String getProfile_image ()
    {
        return profile_image;
    }

    public void setProfile_image (String profile_image)
    {
        this.profile_image = profile_image;
    }

    public String getEmployee_name ()
    {
        return employee_name;
    }

    public void setEmployee_name (String employee_name)
    {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary ()
    {
        return employee_salary;
    }

    public void setEmployee_salary (String employee_salary)
    {
        this.employee_salary = employee_salary;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getEmployee_age ()
    {
        return employee_age;
    }

    public void setEmployee_age (String employee_age)
    {
        this.employee_age = employee_age;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [profile_image = "+profile_image+", employee_name = "+employee_name+", employee_salary = "+employee_salary+", id = "+id+", employee_age = "+employee_age+"]";
    }
}
