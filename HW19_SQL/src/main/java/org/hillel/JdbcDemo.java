package org.hillel;

import org.hillel.dao.UserDao;
import org.hillel.entity.Group;
import org.hillel.entity.Role;
import org.hillel.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JdbcDemo {
  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("org.sqlite.JDBC");
    try (Connection connection = getConnection()) {
      UserDao dao = new UserDao(connection);
      User user = new User(100, "Ivan", "student", "123456",
              (List<Group>) new Group(1, "Java", "Learn Java"),
              new Role(1, "Студент", "Студент"));

      dao.create(user);
      System.out.println("CREATE :: " + user);

      User user100 = dao.read(100);
      System.out.println("READ   :: " + user100);

      user100.setName("updated-student");
      dao.update(user100);
      System.out.println("UPDATE :: " + user100);

      dao.delete(100);

      System.out.println("DONE!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static Connection getConnection() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:D:/test/database4me.db");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }
}
