package org.hillel.entity;
import java.util.List;

public class User
{
  private long id;
  private String name;
  private String login;
  private String password;
  private List<Group> groups;
  private Role role;

  public User(long id, String name, String login, String password, List<Group> groups, Role role) {
    this.id = id;
    this.name = name;
    this.login = login;
    this.password = password;
    this.groups = groups;
    this.role = role;

  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", groups=" + groups +
            ", role=" + role +
            '}';
  }
}
