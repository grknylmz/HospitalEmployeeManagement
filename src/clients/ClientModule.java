package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

import java.sql.SQLException;

/**
 * Created by Gürkan on 25.4.2015.
 */
public class ClientModule {

    public static void main(String[] args) throws Exception{
        Employee peggy= new Employee(1,"Peggy","Accounting",true);


        ClientModule.hireNewEmployee(peggy);
        ClientModule.terminateEmployee(peggy);
        printEmployeeReport(peggy , FormatType.XML);

    }

    public static void hireNewEmployee(Employee employee) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);

    }

    public static void printEmployeeReport(Employee employee,FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

}
