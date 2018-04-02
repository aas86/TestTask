package ru.testtask.alaevandrey.interfaces;


import ru.testtask.alaevandrey.model.Data;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Connector {
    void add(String name) throws ClassNotFoundException, SQLException;
    ArrayList<Data> getData() throws SQLException;
    ArrayList<Data> filterDB(int id, String name) throws SQLException;

    void connect(String login, String password);
}
