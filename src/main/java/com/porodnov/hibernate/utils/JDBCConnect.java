package com.porodnov.hibernate.utils;

import com.porodnov.hibernate.pojo.TaskClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBCConnect {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        getAll();

    }

    private static void getAll() {
        String sql = " SELECT * FROM table1 ";
        List<TaskClass> list = new ArrayList<>();

        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                TaskClass task = new TaskClass();
                task.setId(rs.getInt("id"));
                task.setTaskName(rs.getString("task_name"));
                task.setOwner(rs.getString("owner"));
                task.setPriority(rs.getInt("priority"));
                list.add(task);
            }
            rs.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        for (TaskClass task :list) {
            System.out.println(task.getId() + " - " + task.getTaskName()+ " - " + task.getOwner());
        }
    }


    private static Connection getConnection() throws IOException, SQLException {
        Properties properties = new Properties();
        try (InputStream is = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(is);
        }
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }

}
