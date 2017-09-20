package com.techmaster.javacourse;

import java.sql.*;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 20/09/2017
 */
public class JDBCMaster {

    private final String username;

    private final String password;

    private final String schema;

    private final String dbURL;

    public JDBCMaster(){
        this("techmaster", "java-course123", "vscraper");
    }

    public JDBCMaster(String username, String password, String schema){
        this.username = username;
        this.password = password;
        this.schema = schema;

        this.dbURL = "jdbc:mysql://localhost:3306/" + schema;

        initDriver();
    }

    private void initDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, username, password);
    }

    public static void main(String[] args) throws Exception {
        JDBCMaster jdbcm = new JDBCMaster();
        System.out.println(jdbcm.getConnection());
    }
}
