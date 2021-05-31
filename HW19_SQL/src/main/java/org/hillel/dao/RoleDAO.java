package org.hillel.dao;

import org.hillel.entity.Role;

import java.sql.Connection;

public class RoleDAO implements DAO<Role> {
    private Connection con;

    public RoleDAO(Connection con) {
        this.con = con;
    }
    @Override
    public void create(Role entity) {

    }

    @Override
    public Role read(long id) {
        return null;
    }

    @Override
    public void update(Role entity) {

    }

    @Override
    public void delete(long id) {

    }

    public void getUsers(long groupId){

    }
}
