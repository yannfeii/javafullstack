package jdbc;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JoinStatement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("jdbc.mysql.driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA","root","root123");
        Statement statement = connection.createStatement();
        String joinStatement = "select * from table a join table b where a.id=b.id";
        ResultSet resultset = statement.executeQuery(joinStatement);
        while (resultset.next()){
            System.out.println("results are "+resultset);
        }
    }

}
