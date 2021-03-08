package com.company;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        ConnectDB obj_ConnectDB = new ConnectDB();
        connection = obj_ConnectDB.get_connection();
        Menu menu =new Menu();
        menu.StartFunc();
        try {
            //String queryCreate = "CREATE TABLE movies_premium(movie_name varchar(200),genres varchar(200),rating int,director varchar(100))";
            //String queryInsert = "INSERT INTO movies_premium(movie_name, genres ,rating ,director) values ('The Shawshank Redemption','Drama',10,'Frank Darabont')";
            //String queryInsert = "INSERT INTO movies_premium(movie_name, genres ,rating ,director) values ('Deadpool','Action Fantasy Comedy',7,'Tim Miller')";
            //String queryInsert = "INSERT INTO movies_premium(movie_name, genres ,rating ,director) values ('Ford vs Ferrari','Sport Drama Biography',10,'James Manglod')";
            //String queryInsert = "INSERT INTO movies_premium(movie_name, genres ,rating ,director) values ('The Intern','Comedy Melodrama',9,'Nansy Mayers')";
            //String queryInsert = "INSERT INTO movies_premium(movie_name, genres ,rating ,director) values ('The Martian','Fantasy Adventure',8,'Ridly Scott')";
            //String queryCreate = "CREATE TABLE Bank(User_ID INTEGER,bank_account int,number_card int,CVV int, FOREIGN KEY (User_ID) references login(USER_ID))";
            //String queryCreate="CREATE TABLE Registration(User_ID SERIAL PRIMARY KEY,Name varchar(200),surname VARCHAR(200),username VARCHAR(20),password INT(10),email VARCHAR(100))";
//            String queryCreate="postgrespostgres";


          st = connection.createStatement();
//            //st.executeUpdate(queryDelete);
//
//            String querySelect = "SELECT * FROM employee";
//            rs = st.executeQuery(querySelect);
//
//            while(rs.next()) {
//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//            }
//               st.executeUpdate(queryCreate);
            System.out.println("Done");

            st.close();
            connection.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

