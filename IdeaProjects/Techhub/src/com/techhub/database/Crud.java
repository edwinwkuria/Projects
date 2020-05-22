package com.techhub.database;
import com.mysql.jdbc.Statement;

import java.sql.*;

public class Crud {

    public String generateDBString() {
        String configString = "jdbc:" +
                "mysql:" +
                "//localhost:3306" +
                "/schooldatabase?";
        String credentialsString ="user=root";
        return configString+credentialsString;
    }

    public boolean connectToDatabase(String string){
        try(Connection dbConnection = DriverManager.getConnection(string)){
        return true;
        }
        catch (Exception e){
            errorHandling(e);
        }
        return false;
    }

    public int saveToDatabase(String connectionString,String statementString){
        int generatedKey = 0;
        try(Connection connection = DriverManager.getConnection(connectionString);
            PreparedStatement statement = connection.prepareStatement(statementString, Statement.RETURN_GENERATED_KEYS);
            ){
            statement.executeUpdate();
            try(ResultSet resultSet = statement.getGeneratedKeys()){
                if(resultSet.next()){
                    generatedKey =resultSet.getInt(1);
                }
                return generatedKey;
            }
        }
        catch (Exception e){
            errorHandling(e);
        }
        return generatedKey;

    }

    public void errorHandling(Exception e){
        System.out.println(e.getMessage());
        if(e instanceof SQLException){
            SQLException sqlException = (SQLException)e;
            System.out.println("Errorcode:"+sqlException.getErrorCode());
            System.out.println("SQL State:"+sqlException.getSQLState());
        }
    }
}
