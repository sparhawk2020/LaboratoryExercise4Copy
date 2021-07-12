package com.example.LaboratoryExercise4;

import org.springframework.stereotype.Service;

import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class Connection123 {

    public java.sql.Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");



       // java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "");


        java.sql.Connection con1 = DriverManager.getConnection("  mysql://b736d43c1d799b:c8af87e1@us-cdbr-east-04.cleardb.com/heroku_239361c74896bd2?reconnect=true", "b736d43c1d799b", "c8af87e1");

        return con1;

    }

}
