package jdbc;

import java.sql.*;

public class SelectStatement {

    public  static void main(String[] args){
        Connection connection =  null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load successful");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA","root","root123");
            System.out.println("connected");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String selectQuery = "select actor_id,first_name, last_name from actor";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()){
                int actorId = resultSet.getInt("actor_id");
                String firstName =  resultSet.getString(2);
                String lastName =  resultSet.getString("last_name");
                System.out.println("Actor details : " + actorId + "\t" + firstName + "\t" + lastName + "\t");
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to SQL " + e);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Missing the Driver class!" + classNotFoundException);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the connection " + e);
            }
        }
    }
}
