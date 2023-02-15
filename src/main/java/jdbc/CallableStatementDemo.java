package jdbc;

import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) {
//        selectActor();
        getMoviesWithCategoryAndLanguage();
        getMoviesWithCategoryAndLanguage2();
    }


    private static void getMoviesWithCategoryAndLanguage() {
        // Unhandled exception: java.lang.ClassNotFoundException (checked exception)
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.....");
//            https <protocol> : set of rules governing the transfer of data
//            <protocol><subprotocol><url>
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "mastrong24", "281209plKn@");
            String callProcedure = "{ call GET_MOVIE_DETAILS4 (?,?)}";
            System.out.println("Connected!");
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            System.out.println("Callable Statement created");

            String iParam1 = "";
            String iParam2 = "A";
            final String likes = "%";
            callableStatement.setString(1, iParam1 + likes);
            callableStatement.setString(2, iParam2 + likes);

            ResultSet resultSet = callableStatement.executeQuery();
//            Moves the cursor forward one row from its current position.
            while (resultSet.next()) {
                System.out.println("Movie details : " + resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t");
            }
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Missing the Driver class!" + classNotFoundException);
        } catch (SQLException e) {
            System.out.println("Error connecting to SQL " + e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the connection " + e);
            }
        }
    }

    private static void getMoviesWithCategoryAndLanguage2() {
        //        Unhandled exception: java.lang.ClassNotFoundException (checked exception)
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.....");
//            https <protocol> : set of rules governing the transfer of data
//            <protocol><subprotocol><url>
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "mastrong24", "281209plKn@");
            String callProcedure = "{ call GET_MOVIE_DETAILS4 (?,?)}";
            System.out.println("Connected!");
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            System.out.println("Callable Statement created");

            String iParam1 = "E";
            String iParam2 = "A";
            final String likes = "%";
            callableStatement.setString(1, iParam1 + likes);
            callableStatement.setString(2, iParam2 + likes);

            ResultSet resultSet = callableStatement.executeQuery();
//            Moves the cursor forward one row from its current position.
            while (resultSet.next()) {
                System.out.println("Movie details : " + resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t");
            }
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Missing the Driver class!" + classNotFoundException);
        } catch (SQLException e) {
            System.out.println("Error connecting to SQL " + e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the connection " + e);
            }
        }
    }
}

//    CREATE PROCEDURE GET_MOVIE_DETAILS4(LANGUAGE_IN CHAR(50), CATEGORY_NAME_IN CHAR(50))
//    BEGIN
//        SELECT FILM.TITLE, LANGUAGE.NAME AS 'LANGUAGE', CATEGORY.NAME AS 'CATEGORY'
//        FROM FILM
//        JOIN LANGUAGE ON FILM.LANGUAGE_ID = LANGUAGE.language_id
//        JOIN FILM_CATEGORY ON FILM.FILM_ID = FILM_CATEGORY.FILM_ID
//        JOIN CATEGORY ON CATEGORY.category_id = film_category.category_id
//        where (FILM.TITLE LIKE LANGUAGE_IN AND
//        CATEGORY.NAME LIKE CATEGORY_NAME_IN) or (FILM.TITLE = '' AND CATEGORY.NAME LIKE CATEGORY_NAME_IN);
//     END;

