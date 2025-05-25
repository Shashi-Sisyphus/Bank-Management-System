package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {


      public Connection connection;
      public  Statement statement;
      public Con() {

          try {

              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "WJ28@krhps");
              statement = connection.createStatement();

          } catch (Exception e) {
              e.printStackTrace();
          }

      }




}
