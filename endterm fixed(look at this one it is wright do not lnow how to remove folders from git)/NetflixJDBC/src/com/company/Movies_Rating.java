package com.company;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;

 public class Movies_Rating {
     public void giveRating(int rating, String movie_name1) {
         Connection connection = null;
         String host = "localhost";
         String port = "5432";
         String db_name = "Netflix";
         String username = "postgres";
         String password = "2009";
         Statement st = null;
         ResultSet rs = null;
         ConnectDB connectDB = new ConnectDB();
         try {
             Class.forName("org.postgresql.Driver");
             connection = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db_name, username, password);
             //st = connection.prepareStatement(qry);
             st = connection.createStatement();
             String queryUpdate = "     UPDATE movies SET rating = " + rating + " WHERE movie_name = '" + movie_name1 + "';";
             rs = st.executeQuery(queryUpdate);
             System.out.println("Successful Records Done");
             rs.close();
             connection.close();
         } catch (Exception e) {
             System.out.println(e);
         }
     }
 }