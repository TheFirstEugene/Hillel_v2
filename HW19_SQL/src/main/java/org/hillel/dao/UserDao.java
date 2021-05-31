package org.hillel.dao;

import org.hillel.entity.Group;
import org.hillel.entity.Role;
import org.hillel.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements DAO<User> {
  private Connection con;
  public UserDao(Connection con) {
    this.con = con;
  }

  @Override
  public void create(User entity) {
    try (PreparedStatement ps = con.prepareStatement(INSERT_USER)) {
      ps.setLong(1, entity.getId());
      ps.setString(2, entity.getName());
      ps.setString(3, entity.getLogin());
      ps.setString(4, entity.getPassword());

      ps.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public User read(long id) {
    User user = null;
    RoleDAO roleDAO = new RoleDAO(con);
    GroupDAO groupDAO = new GroupDAO(con);
    List<Group> groups = new ArrayList<>();

    try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USER)) {
      preparedStatement.setLong(1, id);
      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        while (resultSet.next()) {
          String name = resultSet.getString("name");
          String login = resultSet.getString("login");
          String password = resultSet.getString("password");
          Role role = roleDAO.read(resultSet.getLong("role"));

          try(PreparedStatement prGetGroup = con.prepareStatement(UG_INSERT)) {
            prGetGroup.setLong(1,id);
            try(ResultSet resultSet1 = prGetGroup.executeQuery()) {
              while (resultSet1.next()){
                groups.add(groupDAO.read(resultSet1.getLong("group")));
              }
            }
          }
          user = new User(id, name, login, password,groups,role);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return user;
  }

  @Override
  public void update(User entity) {
    try (PreparedStatement ps = con.prepareStatement(UPDATE_SQL)) {
      ps.setString(1, entity.getName());
      ps.setString(2, entity.getLogin());
      ps.setString(3, entity.getPassword());
      ps.setLong(4, entity.getId());

      ps.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void delete(long id) {
    try (Statement stmt = con.createStatement()) {
      stmt.execute(DELETE_SQL + id);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static final String INSERT_USER = "INSERT INTO users(id, name, login, password) VALUES (?, ?, ?, ?)";
  public static final String SELECT_USER = "SELECT * from users WHERE id = ?";
  public static final String UPDATE_SQL = "UPDATE users SET name = ? , login = ?, password = ? WHERE id = ?";
  public static final String DELETE_SQL = "DELETE FROM users WHERE id = ";

  private final String UG_INSERT = "INSERT INTO usersGroups (groupID, userID) VALUES (?, ?)";
  private final String UG_SELECT_USERS = "SELECT ug.userID FROM usersGroups ug WHERE groupID = ?";
  private final String UG_SELECT_GROUPS = "SELECT ug.groupID FROM usersGroups ug WHERE userID = ?";
  private final String UG_DELETE_USER = "DELETE FROM usersGroups WHERE userID = ";
}
