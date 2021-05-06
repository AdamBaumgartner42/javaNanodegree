package inheritanceExample;

public class StudentEmployee extends Student {
    private double rateOfPayPerHour;
    String employeeID;

    public StudentEmployee (String firstName,
                            String lastName,
                            String studentID,
                            String employeeID,
                            double rateOfPayPerHour){
        super(firstName, lastName, studentID);
        this.employeeID = employeeID;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID (String employeeID){
        this.employeeID = employeeID;
    }

    public double getRateOfPayPerHour(){
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour){
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString(){
        return super.toString() + " employeeID: " + employeeID +
                " pay " + rateOfPayPerHour;
    }


}
