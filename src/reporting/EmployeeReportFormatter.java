package reporting;

import domain.Employee;

/**
 * Created by G�rkan on 25.4.2015.
 */
public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
        //TODO Auto generated  Constructor
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }




}
