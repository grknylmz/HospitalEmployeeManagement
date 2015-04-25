package domain.dao;

import database.DatabaseConnectionManager;
import domain.Employee;

import java.sql.SQLException;

/**
 * Created by Gürkan on 25.4.2015.
 */
public class EmployeeDAO {
    public void saveEmployee(Employee employee) throws SQLException {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getConnectionInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("INSERT INTO Customers(CompanyName,ContactName) VALUES('ali','Veli') ");
        connectionManager.disconnect();
        System.out.println("Saved employee to database" + employee);
    }
    public void  deleteEmployee(Employee employee){
        System.out.println("Deleted employee from database");
    }
}
