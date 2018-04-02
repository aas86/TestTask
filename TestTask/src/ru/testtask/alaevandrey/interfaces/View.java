package ru.testtask.alaevandrey.interfaces;

import ru.testtask.alaevandrey.model.Data;

import java.sql.SQLException;
import java.util.ArrayList;

public interface View {
    void addNewListener(ViewListener listener);
    void startApplication();
    void showDB(ArrayList<Data> resultSet) throws SQLException;
}
