package com.department;

import com.model.Employee;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        Department d = new Department();
        Employee emp = d.getEmployeeDetails();

        System.out.println("Employee Id: "+ emp.eId +"  Employee Name : "+ emp.eName +"  Employee Address..: "+ emp.eAddress );
        System.out.println("*********************************************");

        Company cmp =  d.getAllEmployeeDetails();
        System.out.println("Employee 1 Details "+ cmp.e1.eId +"  , "+cmp.e1.eName+ "  ,"+cmp.e1.eAddress  );
        System.out.println("Employee 2 Details "+ cmp.e2.eId+ "  , "+ cmp.e2.eName+ "  ,"+cmp.e2.eAddress  );
        System.out.println("Employee 3 Details "+ cmp.e3.eId+ "  , "+ cmp.e3.eName+ "  ,"+cmp.e3.eAddress  );

        System.out.println("Main method Completed...");
    }
}
