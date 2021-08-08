package Example2;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public boolean isPromotionDueThisYear() {
        //promotion logic implementation
        return false;
    }

    public Double calcIncomeTaxForCurrentYear() {
        //income tax logic implementation
        return new Double(0);
    }
    //Getters & Setters for all the private attributes
}