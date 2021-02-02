import beans.Employee;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String connStr = "jdbc:mariadb://localhost:3306/example?user=root&password=";
        try {
            Connection conn = DriverManager.getConnection(connStr);
            if (conn != null) {
                System.out.println("Connection success !");
            } else {
                System.out.println("Filed to make connection !");
            }
            Employee employee = new Employee("Iryna Mertsalova", new BigDecimal(12574585));
//            Add(employee, conn);
//            List<Employee> list = getAll(conn);
//            for (Employee item: list) {
//                System.out.println(item);
//            }
//            Update(new Long(1), "NewName", new BigDecimal(123587588), conn);
            Delete(new Long(1), conn);
        } catch (Exception ex) {
            System.out.println("Connection error : " + ex.getMessage());
        }
    }

    private static List<Employee> getAll(Connection conn) throws SQLException {
        List<Employee> list = new ArrayList<Employee>();
        String sql = "SELECT * FROM tbl_employees";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            Long id = resultSet.getLong("ID");
            String name = resultSet.getString("NAME");
            BigDecimal salary = resultSet.getBigDecimal("SALARY");
            Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");

            Employee obj = new Employee();
            obj.setId(id);
            obj.setName(name);
            obj.setSalary(salary);
            obj.setCreatedDate(createdDate.toLocalDateTime());
            list.add(obj);
        }
        return list;
    }

    private static void Add(Employee emp, Connection conn) throws SQLException {
        String sql = "INSERT INTO tbl_employees "
                + "(NAME, SALARY, CREATED_DATE)"
                + " VALUES (?, ?, ?);";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, emp.getName());
        statement.setBigDecimal(2, emp.getSalary());
        statement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
        int rowInserted = statement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("A new employee was inserted successful");
            System.out.println(emp);
        }
    }

    private static void Update(Long id, String name, BigDecimal salary, Connection conn) throws SQLException {
        String sql = "UPDATE `tbl_employees` SET `NAME` = ?, `SALARY` = ? WHERE `tbl_employees`.`ID` = ?;";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, name);
        statement.setBigDecimal(2, salary);
        statement.setLong(3, id);
        int rowInserted = statement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("A employee was updated successful");
        }
    }

    private static void Delete(Long id, Connection conn) throws SQLException {
        String sql = "DELETE FROM `tbl_employees` WHERE `tbl_employees`.`ID` = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, id);
        int rowInserted = statement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("A employee was deleted successful");
        }
    }
}