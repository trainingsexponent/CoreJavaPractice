package com.department;


import com.model.Employee;

public class Department {


    public Employee getEmployeeDetails(){
        Employee e = new Employee();
        e.eId=100;
        e.eName="Ajay";
        e.eAddress= "Pune";

        Employee e1 = new Employee();
        e1.eId=101;
        e1.eName="Ajay1";
        e1.eAddress= "Pune1";

        return e1;
    }


   public Company getAllEmployeeDetails(){
       Company comp = new Company();

       comp.e1.eId=201;
       comp.e1.eName="ABC1";
       comp.e1.eAddress="Pune1";

       comp.e2.eId= 202;
       comp.e2.eName="ABC2";
       comp.e2.eAddress="Pune2";

       comp.e3.eId= 203;
       comp.e3.eName="ABC3";
       comp.e3.eAddress="Pune3";

       return comp;
    }
}
