package org.designpattern.creational.builder.withdirector.employeereportgenerator;

import java.util.Date;
import java.util.List;

public record Report(String name, String employeeId, String department, String email, String phoneNumber,
                     String address, String designation, Date dateOfJoining, String salary, String managerName,
                     List<String> kpis, Integer performanceRatings, List<String> projectContributions,
                     List<String> customNotes)
{

}
