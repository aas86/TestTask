package ru.testtask.alaevandrey.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ViewListener {
    void needAddToDB(String name) throws SQLException, ClassNotFoundException;
    void needSelectFromDB() throws SQLException;
    void needFilterDB(int id, String name) throws SQLException;
    void needConnect(String login, String password);
}
