package org.hillel.dao;

import org.hillel.entity.Group;

import java.sql.Connection;

public class GroupDAO implements DAO<Group> {
    private Connection con;

    public GroupDAO(Connection con){
        this.con = con;
    }

    @Override
    public void create(Group entity) {

    }

    @Override
    public Group read(long id) {
        return null;
    }

    @Override
    public void update(Group entity) {

    }

    @Override
    public void delete(long id) {

    }

    public void getUsers(long groupId){

    }
}
